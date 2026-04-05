import java.util.Scanner;

public class LatihanPengeluaranBelanja2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float p_makan, p_transport, p_belanja;

        //INPUT
        System.out.println("Input Pengeluaran Bulanan");
        System.out.print("Masukkan biaya makan     : ");
        makan = input.nextFloat();

        System.out.print("Masukkan biaya transport : ");
        transport = input.nextFloat();

        System.out.print("Masukkan biaya belanja   : ");
        belanja = input.nextFloat();

        //PROSES
        // 1. Menghitung total semua pengeluaran
        total = makan + transport + belanja;

        // 2. Hitung persentase (Nilai / Total * 100)
        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        // --- OUTPUT ---
        System.out.println("\n--- Ringkasan Persentase Pengeluaran ---");
        System.out.println("Total Pengeluaran : Rp " + total);
        System.out.println("----------------------------------------");
        
        System.out.printf("Makan     : %.2f%%\n", p_makan);
        System.out.printf("Transport : %.2f%%\n", p_transport);
        System.out.printf("Belanja   : %.2f%%\n", p_belanja);

        input.close();
    }
}