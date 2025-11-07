package YusnulMagfira;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan angka M : ");
        int M = sc.nextInt();
        for (int i = 1; i <= angka ; i++) {
            if(i % M == 0){
                System.out.println("Kelipatan dari angka 1-N : " + i);
            }

        }
    }
}
