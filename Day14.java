package YusnulMagfira;

public class Day14 {
    public static void main(String[] args) {
        String inte = "123";
        String dobel ="233.4";
        String bulean = "true";

        //mengkonversi nilai string ke type data primitif
        int angka = Integer.parseInt(inte);
        double angka1 = Double.parseDouble(dobel);
        boolean angka2 = Boolean.parseBoolean(bulean);

        //mencetak output
        System.out.println("Nilai int : " + angka);
        System.out.println("Nilai double : " + angka1);
        System.out.println("Nilai boolean : " + angka2);
    }
}
