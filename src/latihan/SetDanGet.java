package latihan;


class main {
    private int myPoint;

    public void setMyPoint(int myPoint) {
        this.myPoint = myPoint;
    }

    public int getMyPoint() {
        return myPoint;
    }

    public void tampil() {
        System.out.println("Point: " + myPoint);
    }
}

public class SetDanGet {

    public static void main(String[] args) {

        main dongo = new main();

        dongo.setMyPoint(100);

        dongo.tampil();

    }
}
