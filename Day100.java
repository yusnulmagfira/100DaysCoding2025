package YusnulMagfira;
import java.util.*;

public class Day100 {

    static int[] arrBaru; // array hasil hashing & pergeseran
    static int n;

    // Fungsi untuk menghitung total pergeseran dan membentuk array baru
    static int retas(int[] arr) {
        n = arr.length;
        arrBaru = new int[n];
        Arrays.fill(arrBaru, -1); // -1 artinya kosong

        int totalPergeseran = 0;

        for (int x : arr) {
            int idx = x % n;
            int geser = 0;

            // Linear probing ke kanan
            while (arrBaru[idx] != -1) {
                idx = (idx + 1) % n;
                geser++;
            }

            arrBaru[idx] = x;
            totalPergeseran += geser;
        }

        return totalPergeseran;
    }

    // Fungsi untuk menyusun kode sandi
    static String susunKode(int p) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrBaru.length && sb.length() < p; i++) {
            if (arrBaru[i] != -1) {
                sb.append(arrBaru[i]);
            }
        }

        // Ambil hanya p digit pertama
        return sb.substring(0, Math.min(p, sb.length()));
    }

    // Contoh main program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println(kode);
    }
}
