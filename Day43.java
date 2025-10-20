package YusnulMagfira;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int angka  = sc.nextInt();

        if(angka >= 90){
            System.out.println("A");
        }else if(angka >= 80){
            System.out.println("B");
        } else if (angka >= 70) {
            System.out.println("C");
        } else if (angka >= 60) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
