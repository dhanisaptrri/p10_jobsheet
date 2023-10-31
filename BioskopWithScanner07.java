import java.util.Scanner;

public class BioskopWithScanner07 {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama: ");
            nama = scan.nextLine();
            System.out.print("Masukan baris: ");
            baris = scan.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = scan.nextInt();
            scan.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n)");
            next = scan.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
}
