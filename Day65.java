package YusnulMagfira;

import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Masukkan inputan angka: ");
        int angka = sc.nextInt();
        int hasil = 1;
            for (int i = 1; i <= angka; i++) {
                hasil *= i;
            }
            System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
}
