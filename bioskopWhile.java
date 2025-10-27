import java.util.Scanner;

public class bioskopWhile {
    public static void main(String[] args) {
        final int HARGA_TIKET = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");

        
            if (!input.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka.\n");
                input.next(); 
                continue;
            }

            int jumlah = input.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan ulangi.\n");
                continue;
            }

            if (jumlah == 0) {
                break; 
            }

           
            double harga = jumlah * HARGA_TIKET;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            double totalBayar = harga - (harga * diskon);

            totalTiket += jumlah;
            totalPenjualan += totalBayar;

            System.out.printf("Pembelian %d tiket. Diskon: %.0f%%. Total bayar: Rp %, .0f\n\n",
                    jumlah, diskon * 100, totalBayar);
        }

        // Tampilkan hasil akhir
        System.out.println("=== Rangkuman Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.printf("Total penjualan     : Rp %, .0f\n", totalPenjualan);

        input.close();
    }
}
