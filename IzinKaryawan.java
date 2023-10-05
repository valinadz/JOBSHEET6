import java.util.Scanner;

public class IzinKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah karyawan memiliki izin? (Ya/Tidak)");
        String izin = scanner.nextLine();

        if (izin.equalsIgnoreCase("Ya")) {
            System.out.println("Karyawan memiliki izin.");
            System.out.print("Apakah izin karyawan masih berlaku? (Ya/Tidak): ");
            String izinBerlaku = scanner.nextLine();

            if (izinBerlaku.equalsIgnoreCase("Ya")) {
                System.out.println("Karyawan diizinkan masuk.");
            } else if (izinBerlaku.equalsIgnoreCase("Tidak")) {
                System.out.println("Izin karyawan tidak berlaku. Karyawan tidak diizinkan masuk.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else if (izin.equalsIgnoreCase("Tidak")) {
            System.out.println("Karyawan tidak memiliki izin. Karyawan tidak diizinkan masuk.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}