package YusnulMagfira;
import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Masukkan Username : ");
        String username = sc.nextLine();
        System.out.print("Masukkan Pasword : ");
        String password = sc.nextLine();

        while (true){
            System.out.println("=== LOGIN AKUN ===");
            System.out.print("Masukkan Username : ");
            String user = sc.nextLine();
            System.out.print("Masukkan Pasword : ");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("LOGIN BERHASIL");
                break;
            }else {
                System.out.println("PERIKSA KEMBALI USERNAME DAN PASSWORD ANDA");
            }
        }
    }
}
