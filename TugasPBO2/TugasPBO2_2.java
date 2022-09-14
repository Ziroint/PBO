import java.util.Scanner;
public class TugasPBO2_2 {
    public static void main(String args[]) {
        while(true){
            String kata;
            kata = "Kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
            System.out.println("");
            String huruf;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kata yang sesuai:");
            huruf = input.nextLine();
            if (kata.contains(huruf)) {
                System.out.println("Inputan benar");
                break;
            } else {
                System.out.println("Input ulang ");
            }
        }

    }
}
