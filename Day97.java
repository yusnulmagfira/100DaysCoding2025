package YusnulMagfira;

public class Day97 {
    static int HitungLuas(int sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi = 5;
        int luas = HitungLuas(sisi);
            System.out.println("Panjang sisi: " + sisi);
            System.out.println("Luas persegi: " + luas);
    }
}
