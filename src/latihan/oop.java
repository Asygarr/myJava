package latihan;

class Mahasiswa {
    String firstName;
    String lastName;

    Mahasiswa(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Jurusan jurusan;
    IPK ipk;

    void beriJurusan (Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    void beriIPK (IPK ipk) {
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nama : " + this.firstName + " " + this.lastName);
        this.jurusan.tampil();
        this.ipk.tampil();
    }
}

class Jurusan {
    String jurusan;

    Jurusan (String jurusan) {
        this.jurusan = jurusan;
    }

    void tampil() {
        System.out.println("Jurusan : " + this.jurusan);
    }
}

class IPK {
    double ipk;

    IPK (double ipk) {
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("IPK : " + this.ipk);
    }
}

public class oop {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Asygar","Faeruddin");
        Jurusan informatika = new Jurusan("Teknik Informatika");
        IPK ipk = new IPK(3.9);

        mahasiswa1.beriJurusan(informatika);
        mahasiswa1.beriIPK(ipk);
        mahasiswa1.tampil();
    }
}
