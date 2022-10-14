import java.util.Scanner;

public class biayawarnet {
        // membuat atribut
        private int internet;
        private int ketik;
        private int game;


        private int scan;
        private int hitamputih;
        private int warna;
        private int tehbotol;

        //fungsi untuk menghitung biaya lamanya menggunakan komputer
        public double biayapenggunaankomputer(){
            double komputer = ((this.internet/60)*(double)4000)+ ((this.ketik/60)*(double)2000) + ((this.game/60)*(double)5000);
            return komputer;

        }
        public double fasilitas(){
            double biayafasilitas = this.scan*1000+this.warna*500+this.warna*300+this.tehbotol*3000;
            return biayafasilitas;
        }

        // total biaya dari hasil perhitungan
        public double totalbiaya(){
            return biayapenggunaankomputer()+fasilitas();
        }
        public biayawarnet(){
            System.out.println("Masukkan lamanya pemakaian ");
        }

        // constructor untuk menginisialisasi suatu nilai
        public biayawarnet(int i,int k, int g, int s, int w, int h, int t){
            this.internet = i;
            this.ketik = k;
            this.game = g;
            this.scan = s;
            this.warna = w;
            this.hitamputih= h;
            this.tehbotol=t;
        }

        public static void main(String[] args) {
            // scanner untuk menginput nilai
            Scanner sc = new Scanner(System.in);
            biayawarnet wn = new biayawarnet();

            // sc.nextInt() untuk input nilai yang integer.
            System.out.print("Masukkan lama penggunaan internet : ");
            wn.internet= sc.nextInt();
            System.out.print("Masukkan lama penggunaan pengetikan : ");
            wn.ketik = sc.nextInt();
            System.out.print("Masukkan lama penggunaan game : ");
            wn.game = sc.nextInt();

            System.out.print("Masukkan banyak file yang akan discan : ");
            wn.scan = sc.nextInt();
            System.out.print("Masukkan banyak file yang akan diprint warna : ");
            wn.warna = sc.nextInt();
            System.out.print("Masukkan banyak file yang akan diprint hitam-putih : ");
            wn.hitamputih = sc.nextInt();
            System.out.print("Masukkan banyak teh botol yang diminum:");
            wn.tehbotol = sc.nextInt();

            System.out.println("\nLama penggunaan komputer adalah :" );
            // mengganti nama constructor menjadi lama agar bisa diakses dalam fungsi main
            biayawarnet lama = new biayawarnet(wn.internet,wn.ketik,wn.game,wn.scan,wn.warna,wn.hitamputih,wn.tehbotol);
            //memanggil fungsi perhitungan yang telah dibuat
            System.out.printf("\nTotal seluruh biaya: Rp %.2f", lama.totalbiaya());
        }
    }

