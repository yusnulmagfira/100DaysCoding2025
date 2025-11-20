package YusnulMagfira;

import java.util.Scanner;

public class EvaluasiMentor2 {
    public static void main(String[] args) {
//            byte angka = 1;
//            short angka1 = 2;
//            int angka2 = 3;
//            long angka3 = 4;
//            float angka4 = 5.2f;
//            double angka5 = 6.2;
//            boolean angka6 = true;
//            char angka7 = '7';
//            String nama = "fira";
//            System.out.print(angka);
//            System.out.println(angka1);1
//            System.out.printf(" %s" ,nama);
//
//            for (int i = 3; i <= 100 ; i+=3) {
//                if (i >= 50){
//                    break;
//                }
//                System.out.println(i);
//            }
//        Scanner sc = new Scanner(System.in);
//                    System.out.print("Masukkan inputan angka 1 - 3 : ");
//                    int angka = sc.nextInt();
//
//                    switch (angka){
//                        case 1:
//                            System.out.println("ayo pulang");
//                            break;
//
//                        case 2:
//                            System.out.println("sekarang pulang");
//                            break;
//
//                        case 3:
//                            System.out.println("waktunya pulang");
//                            break;
//
//                    }
//            System.out.print("Masukkan berat badan wahyu : ");
//            int bb = sc.nextInt();
//
//            String hasil = (bb >= 30)? "berat" : "ringan" ;
//            System.out.println("berat badan wahyu termasuk : " +hasil);

        int i = 1;
        do {
            if (i == 2) {
                i++;
                continue;
            }
            if (i == 10) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }while (true) ;
    }
}


