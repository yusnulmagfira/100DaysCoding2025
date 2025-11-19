package YusnulMagfira;
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=== PILIH MENU ===");
            System.out.println("1. Jus alpukat");
            System.out.println("2. Jus jeruk");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");

            menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("Jus alpukat dengan harga Rp. 10.000");
            } else if (menu == 2) {
                System.out.println("Jus jeruk dengan harga Rp. 7.000");
            }
        }while (menu != 3);
            System.out.println("Selesai.");
    }
}
