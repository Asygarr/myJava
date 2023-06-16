package tugas3;

import java.util.Scanner;

public class MenghitungGaji {

    public static void main(String[] args){
        //deklarasi
        String ulang;
        String nama,alamat,jabatan;   //input
        String status;                //input
        float anak;                   //input
        float gaji_pokok=0;           //output
        float tk=0,ta=0;              //output
        float tt;                     //output
        float gaji_total;             //output
        float pajak= (float) 0.05;    //output

        //''''''''
        int karywan = 0;
        int karyawanNikah = 0;
        int karyawanBelumNikah = 0;
        int karyawanPunyaAnak = 0;
        float gatot = 0;
        float rataRataGatot;
        float gamax = 0;
        float gamin = 6000000;

        do {
            karywan++;

            //penginputan
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nama anda = ");
            nama = sc.nextLine();
            System.out.print("Masukkan alamat anda = ");
            alamat = sc.nextLine();
            System.out.print("Masukkan jabatan anda = ");
            jabatan = sc.nextLine();
            System.out.print("Masukkan status anda = ");
            status = sc.nextLine();
            System.out.print("Anak = ");
            anak = sc.nextFloat();

            //proses
            if (jabatan.equalsIgnoreCase("admin")){
                gaji_pokok = 3_000_000;
            }
            if (jabatan.equalsIgnoreCase("kabag")){
                gaji_pokok = 4_500_000;
            }
            if (jabatan.equalsIgnoreCase("manager")){
                gaji_pokok = 5_000_000;
            }


            if (status.equalsIgnoreCase("menikah")){
                tk = 500_000;
                karyawanNikah++;
            }
            if (status.equalsIgnoreCase("janda")){
                tk = 250_000;
            }
            if (status.equalsIgnoreCase("duda")) {
                tk = 250_000;
            }
            if (status.equalsIgnoreCase("belum Menikah")){
                tk = 0;
                karyawanBelumNikah++;
            }


            if (anak <= 3 && anak != 0){
                ta = 500_000;
                karyawanPunyaAnak++;
            }
            if (anak > 3) {
                ta = 5_000_000;
                karyawanPunyaAnak++;
            }

            // cari gatot
            tt = tk + ta;
            gaji_total = (gaji_pokok + tt) - pajak;

            // Rata rata gaji pokok
            gatot += gaji_total;
            rataRataGatot = gatot / karywan;

            // mencari gamax dan gamin
            if (gaji_total > gamax) {
                gamax = gaji_total;
            } else if (gaji_total < gamin){
                gamin = gaji_total;
            }

            //output
            System.out.println("BIODATA KARYAWAN");
            System.out.println("Nama Karywan = "+nama);
            System.out.println("Alamat = "+alamat);
            System.out.println("Jabatan = "+jabatan);
            System.out.println("Gaji Pokok = "+gaji_pokok);
            System.out.println("Total Tunjangan = "+tt);
            System.out.println("Total Gaji = "+gaji_total);
            System.out.println();

            System.out.print("ulang? (y/n)");
            ulang = sc.next();
            System.out.println();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("================================");
        System.out.println("Total karyawan = "+ karywan);
        System.out.println("Rata-Rata Gaji pokok = "+ rataRataGatot);
        System.out.println("Gaji total tertinggi = "+ gamax);
        System.out.println("Gaji total terendah = "+ gamin);
        System.out.println("Karyawan yang sudah nikah = "+ karyawanNikah);
        System.out.println("Karyawan yang belum nikah = "+ karyawanBelumNikah);
        System.out.println("Karyawan yang mempunyai anak = "+ karyawanPunyaAnak);
    }
}
