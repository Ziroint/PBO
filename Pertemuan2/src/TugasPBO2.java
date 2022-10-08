import java.util.Scanner;
public class TugasPBO2 {
    public static void main(String args[]){
        int angka;
        String jwb;
        Scanner input = new Scanner(System.in);
        boolean lanjut;
        do {
            System.out.print("Masukkan nilai dari 0 - 10 :");
            angka = input.nextInt();


            if (angka <= 10 && angka >= 0) {
                System.out.println("Angka yang anda masukkan adalah: " + angka);

            } else {
                System.out.println("Silahkan input yang benar");
            }

            input.nextLine();

            while (true) {
                System.out.print("Apakah mau lanjut[Y/T]?");
                jwb = input.nextLine().toUpperCase();
                if(jwb.equals("Y")){
                    lanjut = true;
                    break;
                }else if(jwb.equals("T")){
                    lanjut = false;
                    break;
                }else{
                    System.out.println("Masukan tidak valid");
                }
            }
        }while(lanjut);
    }
}
