package YusnulMagfira;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        while (true){
            System.out.print("Masukkan angka (negatif untuk berhenti) : ");
            int angka = sc.nextInt();
            if(angka < 0)
                break;
            jumlah += angka;
        }
        System.out.println("Jumlah : " + jumlah);
    }
}
