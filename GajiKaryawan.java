

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input jumlah jam kerja
            System.out.println("Masukkan jumlah jam kerja: ");
            int jamKerja = scanner.nextInt();

            // Meminta input tarif per jam
            System.out.println("Masukkan tarif per jam: ");
      int tarifPerJam = scanner.nextInt();

            // Menghitung gai bruto
            int gajiBruto = jamKerja * tarifPerJam;

            // Menghitung potongan pajak
            double potonganPajak = gajiBruto * 0.10;

            // Menghitung gaji bersih
            double gajiBersih = gajiBruto - potonganPajak;

            // Menampilkan hasil
            System.out.println("Gaji bruto" + gajiBruto);
            System.out.println("potongan pajak" + potonganPajak);
            System.out.println("Gai bersih" + gajiBersih);
        }





    }
}
