package latihan;

class player{
    private String name;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int baseHealth;
    private int baseAttack;
    private int totalDemage;
    private boolean isAlive;

    // object member
    private armor armor;
    private weapon weapon;

    public player(String name){
        this.name = name;
        this.level = 1;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.incrementAttack = 50;
        this.incrementHealth = 50;
        this.isAlive = true;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDemage;
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name + " \t ");
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive);
        System.out.println();
    }

    public String getName(){
        return this.name;
    }

    public void attack(player opponent){
        // hitung damge diberikan
        int demage = this.getAttackPower();
        // print event
        System.out.println("Player " + this.name + " is attacking " + opponent.getName() + " with damage " + demage + "\n");
        // attack si opponent
        opponent.defance(demage);

        this.levelUp();
    }

    public void defance(int demage){
        // recaive demage
        int defancePower = this.armor.getDefancePower();
        int deltaDemage;

        System.out.println(this.name + " defance power : "+ defancePower);
        if (demage > defancePower) {
            deltaDemage = demage - defancePower;
        } else{
            deltaDemage = 0;
        }
        System.out.println("Demage earned : " + deltaDemage + "\n");

        // adding total demage
        this.totalDemage = this.totalDemage + deltaDemage;

        // check is alive
        if (this.getHealth() <=0){
            this.isAlive = false;
            this.totalDemage = this.maxHealth();
        }

        this.display();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level + this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(armor armor){
        this.armor = armor;
    }

    public void setWeapon(weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth +this.armor.getAddHealth() * 10;
    }
}

class weapon{
    private String name;
    private int attack;

    public weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public String getName(){
        return this.name;
    }

    public int getAttack(){
        return this.attack;
    }
}

class armor{
    private String name;
    private int strength;
    private int health;

    public armor (String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }

    public int getDefancePower() {
        return this.strength*2;
    }
}

public class encapsulasi {
    public static void main(String[] args) {
        player player1 = new player("toni");
        armor armor1 = new armor("Death Shork",10,70);
        weapon weapon1 = new weapon("Holy Six father", 500);
        player1.setWeapon(weapon1);
        player1.setArmor(armor1);

        player player2 = new player("Zurg");
        armor armor2 = new armor("Light Scubs",15,45);
        weapon weapon2 = new weapon("Xyghy Scork",250);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player2);

        player1.display();
        player2.display();
    }
}