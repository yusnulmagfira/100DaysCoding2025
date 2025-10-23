package YusnulMagfira;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jam mulai kerja tugas : ");
        int mulaikerja = sc.nextInt();
        System.out.print(" waktu pengerjaan  : ");
        int jamkerja = sc.nextInt();
        int waktukerja = (mulaikerja + jamkerja) % 24 ;
        int bangun = 9 - waktukerja;
        System.out.println(bangun);
        }
    }

