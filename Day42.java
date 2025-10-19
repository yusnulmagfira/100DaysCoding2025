package YusnulMagfira;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();
        System.out.println("===KELIPATAN 3===");
        for (int i = 1; i <= angka ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
        System.out.println("===KELIPATAN 5===");
        for (int i = 1; i <= angka ; i++) {
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("KELIPATAN 3 DAN 5");
        for (int i = 1; i <= angka ; i++) {
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println(i);
            }

        }
    }
}
