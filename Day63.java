package YusnulMagfira;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int angka = sc.nextInt();
        int kali = 1;
        for (int i = 1; i <= angka; i++) {
            kali *= i;
            if(i < angka){
                System.out.print(i + " x ");
            }else{
                System.out.print( i + " = ");
            }
        }
        System.out.println(kali);
    }
}
