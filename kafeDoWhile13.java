import java.util.Scanner;

public class kafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        final int hargaKopi = 15000;
        final int hargaTeh = 10000;
        final int hargaRoti = 12000;

        String namaPelanggan;
        int Kopi, Teh, Roti;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            Kopi = sc.nextInt();

            System.out.print("Jumlah Teh: ");
            Teh = sc.nextInt();

            System.out.print("Jumlah Roti: ");
            Roti = sc.nextInt();

            
            totalHarga = (Kopi * hargaKopi) + (Teh * hargaTeh) + (Roti * hargaRoti);
            System.out.println("Total yang harus dibayar oleh " + namaPelanggan + ": Rp " + totalHarga);

            
            sc.nextLine();

            System.out.println(); 

        } while (true);

        sc.close();
    }
}
