package YusnulMagfira;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        if(angka % 2 == 0){
            System.out.println(angka + " termasuk bilangan genap");
        }else{
            System.out.println(angka + " termasuk bilangan ganjil");
        }
    }
}
