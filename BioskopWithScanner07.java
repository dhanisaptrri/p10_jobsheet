import java.util.Scanner;

public class BioskopWithScanner07{

    public static void main(String[] args ){

        Scanner scan = new Scanner (System.in);

        String nama;
        String next;
        int baris;
        int kolom;
        int menu;
        String[][] penonton = new String[4][2];

        do{
            System.out.println("====================");
            System.out.println("\t Menu");
            System.out.println("====================");
            System.out.println("Input Data Penonton");
            System.out.println("Daftar Penonton");
            System.out.println("Exit");
            System.out.print("Masukan Nomer Menu: ");
            menu = scan.nextInt();
            if (menu== 3) {
                break;
            }
            switch (menu) {
                case 1:
            while (true) {
                System.out.println("===Input Data Penonton===");
                System.out.println("Masukan nama: ");
                nama = scan.next();
                System.out.println("Masukan baris: ");
                baris = scan.nextInt();
                System.out.println("Masukan Kolom: ");
                kolom = scan.nextInt();
                scan.nextLine();

                   if(baris<1 || baris> penonton.length || kolom < 1 || kolom > penonton[0].length){
                    System.out.println("Nomer Baris/Kolom Kursi Tidak Tersedia");
                    continue;
                }

                        if(penonton[baris-1][kolom-1]  != null) {
                            System.out.println("Kursi telah terisi, masukan baris dan kolom kembali.");
                            continue;
                        }else{
                            penonton[baris-1][kolom-1] = nama;
                        }

                System.out.println("Input penonton lainnya? (y/n): ");
                next = scan.nextLine();

                if(nama.equalsIgnoreCase("n")){
                    break;
                }
            }
                    
                    break; //break menu1

                case 2:
                System.out.println("===Tampilkan Daftar Penonton===");
                for (int i = 0; i < penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++) {
                        if(penonton[i][j] != null){
                             System.out.println("Penonton pada baris " + (i+1) + ", kolom" + (j+1) + ": " + penonton[i][j]);
                        }else{
                            System.out.println("Penonton pada baris " + (i+1) + ". kolom " + (j+1) + ": " + "***");

                        }
                       
                    }
                }
                    break;//break menu2

                default:
                System.out.println("Masukan Nomer yang ada pada menu!!!");
                    break; //break def
            }
        }while( menu != 3);
    }
}