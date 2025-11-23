package YusnulMagfira;

public class Day77 {
    public static void main(String[] args) {
        String text = " Hallo everyone ";

        // trim() → menghapus spasi di awal & akhir
        String hasilTrim = text.trim();
        System.out.println(hasilTrim);

        // substring() → mengambil sebagian teks
        String hasilSubstring = hasilTrim.substring(7); // mulai index ke-7
        System.out.println(hasilSubstring);

        // replace() → mengganti teks
        String hasilReplace = hasilTrim.replace("everyone", "guys");
        System.out.println(hasilReplace);
        
    }
}
