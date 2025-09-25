package YusnulMagfira;

public class Day18 {
    public static void main(String[] args) {

        byte  nilaibyte = 5;
        short nilaishort = nilaibyte; //otomatis dari byte ke short
        int nilaiint = nilaishort; //otomatis dari short ke int
        long nilailong = nilaiint; //otomatis dari int ke long
        float nilaifloat = nilailong; //otomatis dari long ke float
        double nilaidouble = nilaifloat; //otomatis dari float ke double

        System.out.println("cetak nilai byte : " +nilaibyte);
        System.out.println("cetak nilai short : " +nilaishort);
        System.out.println("cetak nilai int : " + nilaiint);
        System.out.println("cetak nilai long : " +nilailong);
        System.out.println("cetak nilai float : " + nilaifloat);
        System.out.println("cetak nilai double : " +nilaidouble);
    }
}
