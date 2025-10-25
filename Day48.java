package YusnulMagfira;

import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka1 = sc.nextDouble();
        double hasil;
                switch (operator) {
                    case '+':
                        hasil = angka + angka1;
                        System.out.println("Hasil: " + hasil);
                        break;
                    case '-':
                        hasil = angka - angka1;
                        System.out.println("Hasil: " + hasil);
                        break;
                    case '*':
                        hasil = angka * angka1;
                        System.out.println("Hasil: " + hasil);
                        break;
                    case '/':
                        if (angka1 != 0) {
                            hasil = angka / angka1;
                            System.out.println("Hasil: " + hasil);
                        } else {
                            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                        }
                        break;

                }
            }
        }

