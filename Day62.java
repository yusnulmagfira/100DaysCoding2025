package YusnulMagfira;

import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int angka = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            jumlah += i;
            if(i < angka){
                System.out.print(i + " + ");
            }else{
                System.out.print( i + " = ");
            }
        }
        System.out.println(jumlah);
    }
}
