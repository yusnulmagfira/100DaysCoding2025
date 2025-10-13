package YusnulMagfira;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai anda: ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan kehadiran anda: ");
        int hadir = sc.nextInt();

        if(nilai >= 80){
            System.out.println("Nilai kamu baik");
            if(hadir >= 14){
                System.out.println("Kamu naik kelas");
            }else{
                System.out.println("Kehadiranmu kurang untuk naik kelas");
            }
        }else{
            System.out.println("Nilai mu kurang untuk naik kelas");
        }
    }
}
