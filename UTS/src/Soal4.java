import java.util.*;

class Lingkaran{
    // membuat variabel r dan PHI
    private int r;
    private double PHI = 3.14;

    // set dan get untuk memasukkan dan menampilkan nilai
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPHI(){
        return PHI;
    }
}

// kelilinglingkaran merupakan bagian dari class lingkaran
class Kelilinglingkaran extends Lingkaran{
    // method double untuk perhitungan keliling
    public double Keliling(int r, double PHI){
        double muter = 2 * PHI * r;
        return muter;
    }
}

// Luaslingkaran merupakan bagian dari class lingkaran
class Luaslingkaran extends Lingkaran{
    // method double luas untuk perhitungan luas
    public double Luas(int r, double PHI){
        double luas = PHI * Math.pow(r,2);
        return luas;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        // scanner input untuk menginput nilai
        Scanner input = new Scanner(System.in);
        // membuat object baru agar bisa dipanggil dalam fungsi main
        Lingkaran bulat = new Lingkaran();

        // menginput nilai r
        System.out.print("Masukkan nilai r: ");
        bulat.setR(input.nextInt());

        // membuat object keliling agar bisa dipanggil dalam fungsi main dari class Kelilinglingkaran
        Kelilinglingkaran keliling = new Kelilinglingkaran();
        // output keliling
        System.out.println("\nKeliling lingkaran adalah: "+ keliling.Keliling(bulat.getR(), bulat.getPHI() ));

        // membuat object luas agar bisa dipanggil dalam fungsi main dari class Luaslingkaran
        Luaslingkaran luas = new Luaslingkaran();
        // output luas
        System.out.println("\nLuas lingkaran adalah: "+ luas.Luas(bulat.getR(), bulat.getPHI()));
    }
}
