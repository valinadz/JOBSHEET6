import java.util.Scanner;

public class PenghitunganGajiDenganPajak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam kerja per minggu: ");
        int jamKerja = scanner.nextInt();

        System.out.print("Masukkan gaji per jam: ");
        double gajiPerJam = scanner.nextDouble();

        double gaji;
        if (jamKerja > 0 && jamKerja <= 40) {
            gaji = jamKerja * gajiPerJam;
        } else if (jamKerja > 40 && jamKerja <= 60) {
            gaji = 40 * gajiPerJam + (jamKerja - 40) * (gajiPerJam * 1.5);
        } else {
            System.out.println("Jam kerja tidak valid.");
            return;
        }

        // Menghitung pajak (20% dari gaji)
        double pajak = 0.2 * gaji;
        double gajiSetelahPajak = gaji - pajak;

        System.out.println("Gaji sebelum pajak: " + gaji);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji bersih: " + gajiSetelahPajak);

        scanner.close();
    }
}