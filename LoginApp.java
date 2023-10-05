import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        // Informasi pengguna yang telah terdaftar
        String user1Username = "user1";
        String user1Password = "password1";
        
        String user2Username = "user2";
        String user2Password = "password2";
        
        String user3Username = "user3";
        String user3Password = "password3";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa apakah username dan password cocok
        if (username.equals(user1Username) && password.equals(user1Password)) {
            System.out.println("Login berhasil!");
        } else if (username.equals(user2Username) && password.equals(user2Password)) {
            System.out.println("Login berhasil!");
        } else if (username.equals(user3Username) && password.equals(user3Password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password salah.");
        }
    }
}