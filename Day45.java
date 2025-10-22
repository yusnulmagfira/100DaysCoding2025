package YusnulMagfira;

import java.util.Scanner;

public class Day45 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan inputan angka 1-3 untuk memilih menu: ");
            int angka = sc.nextInt();

            switch (angka){
                case 1:
                    System.out.println("nasi goreng");
                    break;

                case 2:
                    System.out.println("bakso");
                    break;

                case 3:
                    System.out.println("ayam lalapan");
                    break;
            }
        }
    }

