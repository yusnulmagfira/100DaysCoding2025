package YusnulMagfira;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N :");
        int angka = sc.nextInt();
        for (int i = 1; i <= angka ; i++) {
            System.out.println("Mencetak angka 1 - N :" + i);

        }
        for (int i = angka; i >= 1; i--) {
            System.out.println("Mencetak angka N - 1 :" + i);
        }

    }
}
