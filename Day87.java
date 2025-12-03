package YusnulMagfira;
import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = {2, 3, 7, 5, 8};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Angka ditemukan!");
        } else {
            System.out.println("Angka tidak ditemukan!");
        }
    }
}
