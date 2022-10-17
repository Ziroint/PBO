import java.util.Scanner;
class bilangan{
    // membuat variabel dengan nilai 0
    private int nilai =0;

    //method inputbilangan
    public void inputbilangan(){
        // scanner untuk menginput
        Scanner input = new Scanner(System.in);

        // perulangan for dari range 1-10
        for(int i=0; i<10; i++){
            //menampilkan bilangan
            System.out.print("Bilangan " + (i + 1) + " : ");
            // menginput bilangan
            int bil = input.nextInt();

            // menjumlahkan semua bilangan
            nilai = nilai+bil;
        }
    }
    public int jumlah(){
        // memanggil hasil
        int hasil = (nilai);
        return hasil;
    }

}
public class Soal3 {
    public static void main(String[] args) {
        // membuat object baru agar bisa dipanggil dalam fungsi main dari class bilangan
        bilangan nilai = new bilangan();
        // memanggil method inputbilangan.
        nilai.inputbilangan();

        // menampilkan hasil
        System.out.println("\nHasil: "+ nilai.jumlah());

    }
}


