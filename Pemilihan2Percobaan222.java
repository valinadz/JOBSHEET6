import java.util.Scanner;

public class Pemilihan2Percobaan222 {
    public static void main (String []args) {

        Scanner input22 = new Scanner(System.in);

        System.out.println("Masukkan Sudut 1");
        int sudut1 = input22.nextInt();
        System.out.println("Masukkan Sudut 2");
        int sudut2 = input22.nextInt();
        System.out.println("Masukkan Sudut 3");
        int sudut3 = input22.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah Segitiga Siku-Siku");
            else if ((sudut1 == sudut2 && sudut1 == sudut3))
                System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi");
            else if ((sudut1 == sudut2 || sudut2 == sudut3 || sudut3 == sudut1) )
                System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki");
            else 
                System.out.println("Setiga tersebut adalah Segitiga Sembarang");
            
        } else 
            System.out.println("Bukan Segitiga");


    }
}