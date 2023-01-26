package tugas.numerik;

public class MainClassNumerik {
    public static void main(String [] args){
        MetodeBiseksi mbs =new MetodeBiseksi();
        MetodeRegulaFalsi mrf =new MetodeRegulaFalsi();
        MetodeNewtonRepshon mnr = new MetodeNewtonRepshon();
        MetodeSecant ms = new MetodeSecant();

        ms.hitung(1,2,0.0001);
    }
}
