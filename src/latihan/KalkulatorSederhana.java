package latihan;

import java.util.Scanner;

public class KalkulatorSederhana {
    
    public static void main(String[] args){

        float a,b,hasil;
        hasil = 0;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        a = sc.nextFloat();
        System.out.print("masukkan jenis operator = ");
        operator = sc.next().charAt(0);
        System.out.print("masukkan nilai = ");
        b = sc.nextFloat();

        //menggunakan switch case
//        switch (operator){
//            case "+":
//                hasil = (a+b);
//                break;
//            case "-":
//                hasil = (a-b);
//                break;
//            case "*":
//                hasil = (a*b);
//                break;
//            case "/":
//                hasil = (a/b);
//                System.out.println("Jika dibagi dengan 0 maka nilai tak terhingga");
//                break;
//            default:
//                System.out.println("Nilai eror");
//        }
//        System.out.println("Hasil = "+hasil);

        //menggunakan if else
        if (operator == '+'){
            hasil = (a+b);
        }else if (operator == '-'){
            hasil = (a-b);
        }else if (operator == '*'){
            hasil = (a*b);
        }else if (operator == '/'){
            hasil = (a/b);
        }
        System.out.println("Hasil = "+hasil);

    }
}
