import java.util.Scanner;
import java.util.Random;
public class TugasPBO2_3 {
    public static void main(String [] args){

        // menggunakan variabel jari
        String[] jari = {"J","T","K"};
        // scanner main untuk inputan huruf
        Scanner main = new Scanner(System.in);
        String user, komputermain, pilihan;

        // perulangan while ketika nilai benar
        while(true){
            // menggunakan import random untuk komputer menginput nilai
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

            // kondisi if else untuk menentukan mana yang menang mana yang kalah antara komputer dengan user
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
            // perulangan untuk menanyakan apakah mau ulang atau tidak
            System.out.print("Ingin suwit dengan komputer lagi[y/t]?");
            pilihan = main.nextLine();
            if(pilihan.equals("t")){
                System.out.println("Terima kasih");
                break;
            }
        }


    }
}
