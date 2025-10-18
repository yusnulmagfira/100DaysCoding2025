package YusnulMagfira;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gaji = sc.nextDouble();
        System.out.print("Masukkan tunjangan : ");
        double tunjangan = sc.nextDouble();
        System.out.print("Masukkan potongan : ");
        double potongan = sc.nextDouble();
        double gajibersih;

        gajibersih = gaji + tunjangan - potongan;

        System.out.println("gaji pokok : " + gaji);
        System.out.println("tunjangan : " + tunjangan);
        System.out.println("potongan : " + potongan);
        System.out.println("Gaji bersih yang didapatkan : " +gajibersih);

    }
}
