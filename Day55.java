package YusnulMagfira;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan inputan angka : ");
        int angka = sc.nextInt();
        if(angka > 0){
            System.out.println("Iyaji");
        } else if (angka < 0) {
            System.out.println("Tidakji");
        }else{
            System.out.println(" ");
        }
    }
}
