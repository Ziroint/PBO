import java.util.Scanner;
public class TugasPBO2_2 {
    public static void main(String args[]) {
        // menggunakan while untuk perulangan benar
        while(true){
            // variable kata untuk tipe data string
            String kata;
            kata = "Kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
            System.out.println("");
            String huruf;
            // scanner input, untuk menginput kata yang ada
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kata yang sesuai:");
            huruf = input.nextLine();
            // saya menggunakan contains agar bisa mengambil per kata dalam variabel kata
            if (kata.contains(huruf)) {
                System.out.println("Inputan benar");
                break;
            } else {
                System.out.println("Input ulang ");
            }
        }

    }
}
