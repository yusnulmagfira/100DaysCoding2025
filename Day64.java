package YusnulMagfira;
import java.util.Scanner;
public class Day64 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka M : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan nilai pangka N :");
        int angka1 = sc.nextInt();
        int pangkat = 1;
        for (int i = 1; i <= angka1 ; i++) {
            pangkat *= angka;
            if(i < angka1 ){
                System.out.print(angka + " x ");
            }else if(i == angka1){
                System.out.print(angka + " = ");
            }
        }
        System.out.println(pangkat);
    }
}

