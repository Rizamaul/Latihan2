import java.util.Scanner;

public class ProgramJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggiBadan = input.nextDouble();

        System.out.println("\n=== Informasi Pengguna ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        System.out.println("Tinggi Bada: " + tinggiBadan + " cm");

        double hasilAritmatika = (usia * 2) + 10 / 5 - 3;
        System.out.println("\nHasil perhitungan aritmatika: " + hasilAritmatika);

        boolean lebihDari18 = usia > 18;
        System.out.println("Apakah usia lebih dari 18? " + lebihDari18);

        boolean usiaLebihDari18DanTinggiLebihDari160 = (usia > 18) && (tinggiBadan > 160);
        System.out.println("Apakahtinggi lebih dari 160 cm? " + usiaLebihDari18DanTinggiLebihDari160);

        double usiaDouble = (double) usia;
        int tinggiInt = (int) tinggiBadan;

        System.out.println("\nHasil konversi:");
        System.out.println("Usia dalam double  : " + usiaDouble);
        System.out.println("Tinggi dalam int   : " + tinggiInt);

        input.close();
    }
}
