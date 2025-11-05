package YusnulMagfira;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int angka = sc.nextInt();
        for (int i = 1; i <= angka ; i++) {
            if(i % 2 == 1){
                System.out.println("Menampilkan angka ganjil : " + i);
            }
        }
        System.out.println("--------------------------------------");
        for (int i = 1; i <= angka ; i++) {
            if(i % 2 == 0) {
                System.out.println("Menampilkan angka genap : " + i);
            }
        }

    }
}
