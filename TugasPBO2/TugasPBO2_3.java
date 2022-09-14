import java.util.Scanner;
import java.util.Random;
public class TugasPBO2_3 {
    public static void main(String [] args){

        String[] jari = {"J","T","K"};
        Scanner main = new Scanner(System.in);
        String user, komputermain, pilihan;

        while(true){
            komputermain = jari[new Random().nextInt(jari.length)];
            while(true){
                System.out.print("Masukkan jari[J/T/K]: ");
                user = main.nextLine();
                System.out.println("Anda memasukkan " + user);

                if(user.equals("J") || user.equals("T") || user.equals("K")){
                    break;
                }else{
                    System.out.println("Huruf yang anda masukkan salah");
                }
            }

            System.out.println("Komputer memasukkan: " + komputermain);
            if(user.equals(komputermain)){
                System.out.println("Hasil : Seri");
            } else if(komputermain.equals("T")){
                if(user.equals("K")){
                    System.out.println("Hasil : Anda Kalah");
                }else if(user.equals("J")){
                    System.out.println("Hasil : Anda Menang");
                }
            }else if(komputermain.equals("K")){
                if(user.equals("J")){
                    System.out.println("Hasil : Anda Kalah");
                }else if(user.equals("T")){
                    System.out.println("Hasil : Anda Menang");
                }
            }else if(komputermain.equals("J")){
                if(user.equals("T")){
                    System.out.println("Hasil : Anda Kalah");
                }else if(user.equals("K")){
                    System.out.println("Hasil : Anda Menang");
                }
            }
            System.out.print("Ingin suwit dengan komputer lagi[y/t]?");
            pilihan = main.nextLine();
            if(pilihan.equals("t")){
                System.out.println("Terima kasih");
                break;
            }
        }


    }
}
