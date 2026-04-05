import java.util.Scanner;

public class PerhitunganBerbobotLatihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        // S1 Statment Perintah
        System.out.print("Masukkan realisasi: ");
        realisasi = input.nextFloat();

        System.out.print("Masukkan kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan tugas: ");
        tugas = input.nextFloat();

        System.out.print("Masukkan uts: ");
        uts = input.nextFloat();

        System.out.print("Masukkan uas: ");
        uas = input.nextFloat();

        // P1 Proses 1 (Contoh perhitungan bobot)
        b_kehadiran = kehadiran * 0.10f;
        b_tugas = tugas * 0.20f;
        b_uts = uts * 0.30f;
        b_uas = uas * 0.40f;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        // S2 Statment Informasi
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Nilai Total: " + total);
        
        input.close();
    }
}