package YusnulMagfira;
import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        double angka = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka1 =sc.nextDouble();
        double hasil; //= sc.nextDouble();
                if (operator == '+') {
                    hasil = angka + angka1;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '-') {
                    hasil = angka - angka1;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '*') {
                    hasil = angka * angka1;
                    System.out.println("Hasil: " + hasil);
                }
                else if (operator == '/') {
                    if (angka1 != 0) {
                        hasil = angka / angka1;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    }
                }
                else {
                    System.out.println("Operator tidak dikenali!");
                }
            }
        }



