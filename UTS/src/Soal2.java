import java.util.Scanner;

class beratbadan{
    // membuat variabel berat dan tinggi
    private int berat;
    private double tinggi;

    // set dan get untuk memasukkan nilai dan menampilkan nilai
    public void setBerat(int berat){
        this.berat = berat;
    }
    public int getBerat(){
        return this.berat;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return this.tinggi;
    }

    // menggunkan method BMI dengan tipe double untuk menampilkan nilia
    public double BMI(){
        return berat/(tinggi*tinggi);
    }

}
public class Soal2{
    public static void main(String[] args) {
        // membuat object baru agar bisa dipanggil dalam fungsi main dari class beratbadan
        beratbadan badan = new beratbadan();

        // scanner input untuk memasukkan nilai
        Scanner input = new Scanner(System.in);

        // inputan
        System.out.print("Masukkan berat : ");
        badan.setBerat(input.nextInt());
        System.out.print("Masukkan tinggi: ");
        badan.setTinggi(input.nextDouble());

        // output
        System.out.println("\nBerat: "+badan.getBerat()+"kg");
        System.out.println("\nTinggi: "+badan.getTinggi()+"m");

        // membuat variabel untuk menampilkan perhitungan
        double beratb = badan.BMI();
        // output berat dan tinggi
        System.out.println("BMI : " + badan.getBerat()+"kg"+ "/"+ badan.getTinggi()+"*"+badan.getTinggi());
        // output perhitungan
        System.out.println("Berat badan anda: "+ beratb);

        // if else untuk membedakan mana yang berat kurang, pas, dan lebih
        if(beratb<18.5){
            System.out.println("Berat badan kurang");
        }else if(beratb<= 18.5 && beratb >= 22.9){
            System.out.println("Berat badan ideal");
        }else{
            System.out.println("Kegemukan");
        }

    }
}