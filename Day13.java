package YusnulMagfira;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi
        String nama;
       final String nim;
        String ProgramStudy;
        String alamat;
        double tinggibadan;
        float beratbadan;
        byte usia;
        int ukt;
        char golongandarah;
        boolean keaktifanmahasiswa;
        long jarakrumah;
        short sks;
        //inisialisasi
        nama = "lestari";
        nim = "D012345";
        ProgramStudy = "informatika";
        alamat = "majene";
        tinggibadan = 149.7;
        beratbadan = 40.6f;
        usia = 21;
        ukt = 50000000;
        golongandarah = 'Z';
        keaktifanmahasiswa = false;
        jarakrumah = 13;
        sks = 20;

        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Program Study : " + ProgramStudy);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tinggi Badan : " + tinggibadan);
        System.out.println("Berat Badan : " + beratbadan);
        System.out.println("Usia : " + usia);
        System.out.println("Ukt : " + ukt);
        System.out.println("Golongan Darah : " +  golongandarah);
        System.out.println("Keaktifan Mahasiswa : " + keaktifanmahasiswa);
        System.out.println("Jarak Rumah ke Kampus : " + jarakrumah + "Km");
        System.out.println("Jumlah SKS : " + sks);
        System.out.println(" ");
        System.out.println("di update");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("Alamat: ");
        alamat = sc.nextLine();
        System.out.print("Tinggi Badan : ");
        tinggibadan = sc.nextDouble();
        System.out.print("Jarak Rumah : ");
        jarakrumah = sc.nextLong();
        System.out.print("Golongan Darah : ");
        golongandarah = sc.next().charAt(0);

        System.out.println(" ");
        System.out.println("Setelah di update");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Program Study : " + ProgramStudy);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tinggi Badan : " + tinggibadan);
        System.out.println("Berat Badan : " + beratbadan);
        System.out.println("Usia : " + usia);
        System.out.println("Ukt : " + ukt);
        System.out.println("Golongan Darah : " +  golongandarah);
        System.out.println("Keaktifan Mahasiswa : " + keaktifanmahasiswa);
        System.out.println("Jarak Rumah ke Kampus : " + jarakrumah + "Km");
        System.out.println("Jumlah SKS : " + sks);

     System.out.println(
             "Nama: " + nama + "\nnim: " + nim + " \nprogram study : " + ProgramStudy + "\nalamat : " + alamat + "\ntinggi badan : " + tinggibadan
     + "\nBerat badan : " + beratbadan + "\n usia : " + usia + "\nukt : " + ukt + "\n golongan darah: " + golongandarah + "\nkeaktifan mahasiswa : "
     + keaktifanmahasiswa + "\n jarak rumah : " + jarakrumah + "\njumlah sks : " + sks );
    }
}
