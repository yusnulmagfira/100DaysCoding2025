package YusnulMagfira;

public class Day75 {
    public static void main(String[] args) {
        String nama = "Pilong";
        
        int panjang = nama.length();

        // Mengubah string menjadi huruf kapital
        String hurufBesar = nama.toUpperCase();

        // Mengubah string menjadi huruf kecil
        String hurufKecil = nama.toLowerCase();
        
        System.out.println("Panjang nama   : " + panjang);
        System.out.println("Huruf besar    : " + hurufBesar);
        System.out.println("Huruf kecil    : " + hurufKecil);

    }
}
