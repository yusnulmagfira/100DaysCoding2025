import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // penggunaan operator ternary
        String hasil = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";

        System.out.println("Hasil: " + hasil);
    }
}
