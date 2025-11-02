import java.util.Scanner;

public class parkirFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        for (;;) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid.\n");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) { // Mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // Motor
                    total += durasi * 2000;
                }
            }

            System.out.println("Data parkir tercatat.");
            System.out.println("Total sementara: Rp " + total + "\n");
        }

        System.out.println("\n=== Total Pembayaran Parkir Hari Ini ===");
        System.out.println("Total pendapatan: Rp " + total);
        input.close();
    }
}
