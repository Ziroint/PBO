import java.util.Scanner;

class waktu{
    // membuat variabel jam, menit, detik
    private int jam;
    private int menit;
    private int detik;

    // menggunakan set dan get untuk memasukkan nilai dan menampilkan nilai
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    //membuat variabel jamakhir, menitakhir, detikakhir
    private int jamakhir;
    private int menitakhir;
    private int detikakhir;

    // membuat set dan get untuk memasukkan nilai dan menampilkan nilai
    public int getJamakhir() {
        return jamakhir;
    }

    public void setJamakhir(int jamakhir) {
        this.jamakhir = jamakhir;
    }

    public int getMenitakhir() {
        return menitakhir;
    }

    public void setMenitakhir(int menitakhir) {
        this.menitakhir = menitakhir;
    }

    public int getDetikakhir() {
        return detikakhir;
    }

    public void setDetikakhir(int detikakhir) {
        this.detikakhir = detikakhir;
    }
    // membuat variabel ngobrol untuk dipakai dalam void lama dan juga void harga
    private int ngobrol;

    // menggunakan method lama
    public void lama(){
        // menghitung lama jam, menit,detik dalam variabel lamajam,lamamenit,lamadetik
        int lamajam = jamakhir-jam;
        int lamamenit = menitakhir-menit;
        int lamadetik = detikakhir-detik;

        // perhitungan lama mengobrol
        ngobrol = (lamajam*3600)+(lamamenit*60)+(lamadetik);

        // tampilan jam menit dan detik ngobrol
        System.out.println("Lama percakapan: "+lamajam+":"+lamamenit+":"+lamamenit);
    }

    public void harga(){
        // harga lama ngobrol
        double hargangobrol = (ngobrol/5)*150;
        // tampilan hargangorbol
        System.out.printf("Harga lama percakapan: %.2f ", hargangobrol);
    }
}
public class Soal1 {
    public static void main(String[] args) {
        // membuat object agar bisa dipanggil dalam fungsi main dari class oclock
        waktu oclock = new waktu();
        // scanner input untuk memasukkan nilai
        Scanner input = new Scanner(System.in);

        // memasukkan jam, menit,detik
        System.out.print("Masukkan jam awal: ");
        oclock.setJam(input.nextInt());
        System.out.print("Masukkan menit awal: ");
        oclock.setMenit(input.nextInt());
        System.out.print("Masukkan detik awal: ");
        oclock.setDetik(input.nextInt());

        System.out.println("\n");

        // memasukkan jam,menit,detik akhir
        System.out.print("Masukkan jam akhir: ");
        oclock.setJamakhir(input.nextInt());
        System.out.print("Masukkan menit akhir: ");
        oclock.setMenitakhir(input.nextInt());
        System.out.print("Masukkan detik akhir: ");
        oclock.setDetikakhir(input.nextInt());

        System.out.println("\n");

        // menampilkan waktu awal dan waktu akhir
        System.out.println("Waktu awal: "+ oclock.getJam()+ ":"+oclock.getMenit()+":"+oclock.getDetik());
        System.out.println("Waktu akhir: "+ oclock.getJamakhir()+":"+ oclock.getMenitakhir()+":"+oclock.getDetikakhir());

        // menampilkan lama ngobrol
        oclock.lama();
        // harga pulsa lama mengobrol
        oclock.harga();
    }
}
