package YusnulMagfira;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan inputan : ");
        int umur = sc.nextInt();
        if (umur >= 17){
            System.out.println("Anda sudah bisa membuat KTP");
        }else{
            System.out.println("Anda belum cukup umur");
        }
    }
}
