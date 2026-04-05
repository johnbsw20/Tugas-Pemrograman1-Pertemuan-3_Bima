import java.util.Scanner; 

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Sekarang variabelnya kosong, menunggu diisi user
        System.out.print("Masukkan biaya Makan: ");
        int makan = input.nextInt();
        
        System.out.print("Masukkan biaya Transport: ");
        int transport = input.nextInt();
        
        System.out.print("Masukkan biaya Belanja: ");
        int belanja = input.nextInt();

        double diskonPersen = 0.10;

        // Perhitungan tetap sama
        int totalSebelum = makan + transport + belanja;
        int besarDiskon = (int) (totalSebelum * diskonPersen);
        int totalSetelah = totalSebelum - besarDiskon;

        // Output
        System.out.println("\n--- Ringkasan Pembayaran ---");
        System.out.println("Total sebelum diskon : Rp " + totalSebelum);
        System.out.println("Besar diskon (10%)   : Rp " + besarDiskon);
        System.out.println("Total pembayaran     : Rp " + totalSetelah);
        
        input.close();
    }
}