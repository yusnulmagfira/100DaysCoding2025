package YusnulMagfira;

public class Day83 {
    public static void main(String[] args) {
        int[] angka = {5, 3, 7, 2, 4}; 
        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Jumlah semua elemen array : " + jumlah);
    }
}
