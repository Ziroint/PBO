import java.util.Scanner;
public class TugasPBO2 {
    public static void main(String args[]){
        // membuat variabel angka dan jwb dengan tipe data integer dan string.
        int angka;
        String jwb;
        // scanner input digunakan untuk menginput nilai
        Scanner input = new Scanner(System.in);
        // menggunakan boolean lanjut untuk mengetahui mana true dan false
        boolean lanjut;
        // menggunakan do while untuk perulangan
        do {
            System.out.print("Masukkan nilai dari 0 - 10 :");
            angka = input.nextInt();


            // if else untuk memasukkan data, jika salah maka input ulang, jika benar maka akan ditanya kembali
            if (angka <= 10 && angka >= 0) {
                System.out.println("Angka yang anda masukkan adalah: " + angka);

            } else {
                System.out.println("Silahkan input yang benar");
            }

            input.nextLine();
            
            // jika nilai true
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
