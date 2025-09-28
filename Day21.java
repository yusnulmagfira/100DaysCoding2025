package YusnulMagfira;

public class Day21 {
    public static void main(String[] args) {
        int angka = 10;
        int angka1 = 20;

        System.out.println("sebelum ditukar");
        System.out.println("angka : " + angka);
        System.out.println("angka1 : " + angka1);

        // Menukar nilai tanpa variabel tambahan
        angka = angka + angka1; // jumlahnya sekarang 30
        angka1 = angka - angka1; // nilai angka1 sekarang 10
        angka = angka - angka1; // nilai angka sekarang 20

        System.out.println("setelah ditukar");
        System.out.println("angka : " + angka);
        System.out.println("angka1 : " + angka1);
    }
}
