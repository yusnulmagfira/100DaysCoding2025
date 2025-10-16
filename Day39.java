package YusnulMagfira;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        //latihan membuat menu
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN PILIHAN ANDA : ");
        int menu  = sc.nextInt();

        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Pesawat");
        System.out.println("4. Kapal");
        System.out.println("5. Sepeda");

        if(menu == 1){
            System.out.println("Kamu memilih mobil");
        }else if(menu == 2){
            System.out.println("Kamu memilih motor");
        }else if (menu == 3){
            System.out.println("Kamu memilih pesawat");
        }else if (menu == 4){
            System.out.println("Kamu memilih kapal");
        }else if (menu == 5){
            System.out.println("Kamu memilih sepeda");
        }else{
            System.out.println("Tidak ada nomor pilihanmu di menu");
        }
    }
}
