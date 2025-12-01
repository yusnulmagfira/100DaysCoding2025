package YusnulMagfira;

public class Day85 {
    public static void main(String[] args) {
        int[] angka = {12, 5, 30, 7, 25, 18};
        int maksimal = angka[0];
        
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }
        System.out.println("Angka maksimal dalam array adalah: " + maksimal);
    }

}
