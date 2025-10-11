package YusnulMagfira;
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                a += i;
            } else if (i % 2 == 0) {
                b += i;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                c += i;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                d += i;
            }
        }
        System.out.println("A. Total angka ganjil = " + a);
        System.out.println("B. Total angka genap = " + b);
        System.out.println("C. Total angka yang habis dibagi tiga dan lima = " + c);
        System.out.println("D. Total angka yang habis dibagi tiga atau lima = " + d);

        int angka1 = d * b;
        int angka2 = c / a;
        int angka3 = d + b;
        int angka4 = c - a;
        int angka5 = b % d;

        System.out.println("1. D * B = " + angka1);
        System.out.println("2. C / A = " + angka2);
        System.out.println("3. D + B = " + angka3);
        System.out.println("4. C - A = " + angka4);
        System.out.println("5. B % D = " + angka5);

        if (angka3 < 5) {
            System.out.println("ara");
        }else if (angka3 > 5) {
            System.out.println("ara ara");
        }else{
            System.out.println("ara ara ara");
        }

    }
}
