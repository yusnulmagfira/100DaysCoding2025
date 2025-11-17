package YusnulMagfira;
import java.util.Scanner;
public class Day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        for (int i = angka; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


