package YusnulMagfira;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input satu teks dari user
        System.out.print("Masukkan sebuah teks: ");
        String teks = sc.nextLine();

        System.out.println("\n--- HASIL ---");

        // 1. length()
        System.out.println("Panjang teks: " + teks.length());

        // 2. toUpperCase()
        System.out.println("Teks UPPERCASE: " + teks.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Teks lowercase: " + teks.toLowerCase());

        // 4. contains()
        System.out.println("Apakah mengandung kata 'java'? "
                + teks.toLowerCase().contains("java"));

        // 5. isEmpty()
        System.out.println("Apakah teks kosong? " + teks.isEmpty());
    }
}
