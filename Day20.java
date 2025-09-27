package YusnulMagfira;

public class Day20 {
    public static void main(String[] args) {


        //mengubah type data primitif menjadi string

        int umur = 20;
        double tinggi = 156.2;
        char huruf = 'P';

        String satu = String.valueOf(umur);
        String dua = String.valueOf(tinggi);
        String tiga = String.valueOf(huruf);

        System.out.println("Integer ke String : " + satu);
        System.out.println("Double ke String : " + dua);
        System.out.println("Char ke String : " + tiga);

    }
}
