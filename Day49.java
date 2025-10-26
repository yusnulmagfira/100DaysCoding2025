package YusnulMagfira;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berat badan anda : ");
        int bb = sc.nextInt();

        String hasil = (bb >= 55)? "berat" : "ringan" ;
        System.out.println("Kamu termasuk : " +hasil);

    }
}
