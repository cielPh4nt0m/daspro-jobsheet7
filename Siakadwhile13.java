import java.util.Scanner;

public class Siakadwhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt(); 
        int i = 0;

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt(); 

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid (0-100)!");
                continue; 
            }

           
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": A");
                System.out.println("Bagus, Pertahankan nilainya!");
            } else if (nilai > 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": B+");
                System.out.println("Bagus, Pertahankan nilainya!");
            } else if (nilai > 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": B");
            } else if (nilai > 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": C+");
            } else if (nilai > 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": C");
            } else if (nilai > 39) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": E");
            }

            i++; 
        }

        sc.close(); 
    }
}
