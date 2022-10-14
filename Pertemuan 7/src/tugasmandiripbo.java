import java.util.Scanner;
public class tugasmandiripbo {
    // membuat varibel gajipokok, tunjangan dan jam
    private int gajipokok;
    private int tunjangan;
    private int jam;

    // set dam get jam untuk menginput lamanya bekerja dan menampilkan lamanya bekerja
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public static void main(String[] args) {
        // membuat object baru untuk memanggil class tugasmandiripbo
        tugasmandiripbo gaji = new tugasmandiripbo();
        //scanner untuk menginput nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam kerja: ");
        gaji.setJam(input.nextInt());
        // getjam untuk menampilkan inputan
        System.out.println("\n\nJam Kerja Karyawan = "+ gaji.getJam());

        // membuat object baru untuk golongan-golongan yang telah dibuat
        int lembur = gaji.getJam();
        Golongan1 gol1 = new Golongan1();
        Golongan2 gol2 = new Golongan2();
        Golongan3 gol3 = new Golongan3();
        Golongan4 gol4 = new Golongan4();

        // if else untuk membedakan mana yang lebih dari jam kerja, mana yang sama dengan jam kerja, dan mana yang beda dengan jam kerja.
        if(lembur>173){
            int jamlembur = lembur - 173;
            System.out.println("Jamlembur = "+ jamlembur);
            // membuat variabel untuk menghitung bayaran dari lemburnya
            int harga = jamlembur * 20000;
            int totaljam = jamlembur+lembur;
            System.out.println("Total jam kerja = "+ totaljam);
            // memanggil perhitungan dari class yang telah dibuat dengan menggunakan object saaat memanggil
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.gajipokok, gaji.tunjangan)+harga));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.gajipokok, gaji.tunjangan)+harga));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.gajipokok, gaji.tunjangan)+harga));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.gajipokok, gaji.tunjangan)+harga));

        }else if(lembur == 173){
            int jamlembur =0;
            System.out.println("Jamlembur = "+jamlembur);
            // memanggil perhitungan dari class yang telah dibuat
            System.out.println("Total jam kerja = "+ lembur);
            System.out.println("Total gaji golongan 1 = Rp. " + gol1.golongan1(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 2 = Rp. " + gol2.golongan2(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 3 = Rp. " + gol3.golongan3(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 4 = Rp. " + gol4.golongan4(gaji.gajipokok, gaji.tunjangan));
        }else{
            // saya membuat mines ketika si karyawan tidak bekerja sesuai waktu yang telah diberikan
            int jamlembur = 173-lembur;
            System.out.println("Mines jam kerja = "+ jamlembur);
            System.out.println("Total jam Kerja = "+ lembur);
            int mines = jamlembur*10000;
            // memanggil class yang telah dibuat
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.gajipokok, gaji.tunjangan)-mines));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.gajipokok, gaji.tunjangan)-mines));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.gajipokok, gaji.tunjangan)-mines));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.gajipokok, gaji.tunjangan)-mines));
        }
    }
}


// class tiap golongan
class Golongan1 extends tugasmandiripbo{
    // membuat method untuk dipanggil dalam fungsi main
    public double golongan1(int gajipokok, int tunjangan) {
        gajipokok = 1486500;
        tunjangan = 250000;

        // perhitungan gaji dengan menggunakan double agar terdapat koma dalam perkaliannya
        int gajikotor = gajipokok+tunjangan;
        double gajitotal = (double)(gajikotor) * (double) 0.005;
        double gaji = gajikotor - gajitotal;
        return gaji;
    }
}
class Golongan2 extends tugasmandiripbo{
    // method golongan2
    public double golongan2(int gajipokok, int tunjangan){
        gajipokok = 1926000;
        tunjangan = 300000;

        // menghitung gaji dengan double
        int gajikotor = gajipokok+tunjangan;

        double gajitotal = (double)(gajikotor) * (double) 0.005;
        double gaji = gajikotor - gajitotal;

        return gaji;
    }

}
class Golongan3 extends tugasmandiripbo{
    public double golongan3(int gajipokok, int tunjangan){
        gajipokok = 2456700;
        tunjangan = 350000;

        int gajikotor = gajipokok+tunjangan;

        double gajitotal = (double)(gajikotor) * (double) 0.005;
        double gaji = gajikotor - gajitotal;

        return gaji;
    }

}
class Golongan4 extends tugasmandiripbo{
    public double golongan4(int gajipokok, int tunjangan){
        gajipokok = 2899500;
        tunjangan = 400000;

        int gajikotor = gajipokok+tunjangan;

        double gajitotal = (double)(gajikotor) * (double) 0.005;
        double gaji = gajikotor - gajitotal;

        return gaji;

    }

}