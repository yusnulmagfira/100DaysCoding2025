package YusnulMagfira;

public class Day96 {
    public static int kali(int a, int b){
        return a * b;
    }
    public static int bagi(int a, int b){
        return a / b;
    }
    public static int tambah(int a, int b){
        return a + b;
    }
    public static int kurang(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Perkalian : " + kali(2, 1));
        System.out.println("Pembagian : " + bagi(2, 1));
        System.out.println("Penjumlahan : " + tambah(2, 1));
        System.out.println("Pengurangan : " + kurang(2, 1));
    }
}
