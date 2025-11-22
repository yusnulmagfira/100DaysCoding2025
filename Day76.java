package YusnulMagfira;

public class Day76 {
    public static void main(String[] args) {
        String text1 = "Halo";
        String text2 = "halo";
        String kalimat = "Saya sedang belajar Java";
        String kosong = "";

                
        System.out.println("1. equals():");
        if (text1.equals(text2)) {
            System.out.println("text1 sama dengan text2");
        } else {
            System.out.println("text1 TIDAK sama dengan text2");
        }


        System.out.println("\n2. equalsIgnoreCase():");
        if (text1.equalsIgnoreCase(text2)) {
            System.out.println("text1 sama dengan text2 (abaikan huruf besar/kecil)");
        } else {
            System.out.println("text1 TIDAK sama walau diabaikan case-nya");
        }


        System.out.println("\n3. contains():");
        if (kalimat.contains("Java")) {
            System.out.println("Kalimat mengandung kata 'Java'");
        } else {
            System.out.println("Kalimat TIDAK mengandung kata 'Java'");
        }


        System.out.println("\n4. isEmpty():");
        if (kosong.isEmpty()) {
            System.out.println("String kosong");
        } else {
            System.out.println("String tidak kosong");
        }
    }
}



