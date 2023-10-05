import java.util.Scanner;

public class AbsensiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan hari kerja:");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.print("Pilih hari (1-5): ");
        int hariKerja = scanner.nextInt();

        System.out.println("Masukkan waktu kerja:");
        System.out.println("1. Pagi (9:00-12:00)");
        System.out.println("2. Siang (13:00-17:00)");
        System.out.println("3. Malam (18:00-21:00)");
        System.out.print("Pilih waktu kerja (1-3): ");
        int waktuKerja = scanner.nextInt();

        if (hariKerja >= 1 && hariKerja <= 5) {
            if (waktuKerja == 1) {
                System.out.println("Karyawan hadir pada hari Senin pagi.");
            } else if (waktuKerja == 2) {
                System.out.println("Karyawan hadir pada hari Selasa siang.");
            } else if (waktuKerja == 3) {
                System.out.println("Karyawan hadir pada hari Rabu malam.");
            } else {
                System.out.println("Pilihan waktu kerja tidak valid.");
            }
        } else {
            System.out.println("Pilihan hari kerja tidak valid.");
        }

        scanner.close();
    }
}
