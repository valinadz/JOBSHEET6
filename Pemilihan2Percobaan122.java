import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main (String []args) {

        Scanner input22 = new Scanner(System.in);

        System.out.println("Masukkan tahun:  ");
        int tahun = input22.nextInt();

        if ((tahun % 400) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat"); 
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }  
}