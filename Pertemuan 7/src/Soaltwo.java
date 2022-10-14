import java.util.Scanner;
class Soaltwo{

    // membuat varibel dengan tipe data integer
    private int A;
    private int B;
    private int C;

    // set dan get untuk menginput dan menampilkan nilai yang diinput
    public void setA(int a) {
        A = a;
    }
    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
    public int getC() {
        return C;
    }
    public void setC(int c) {
        C = c;
    }

    // fungsi main untuk menjalankan program
    public static void main(String[] args) {
        // membuat object baru agar bisa dijalankan pada fungsi main
        Soaltwo count = new Soaltwo();
        // mengguankan scanner input untuk menginput nilai
        Scanner input = new Scanner(System.in);

        // menggunakan set dan get, dalam set terdapat input.nextInt() untuk menginput nilai
        System.out.println("Soal 1\n");
        System.out.print("Input A: ");
        count.setA(input.nextInt());
        System.out.print("Input B: ");
        count.setB(input.nextInt());
        System.out.print("Input C: ");
        count.setC(input.nextInt());
        System.out.println("\nHasil Output: ");
        System.out.println("Nilai A: " + count.getA());
        System.out.println("Nilai B: " + count.getB());
        System.out.println("Nilai C: "+ count.getC());

        // membuat object baru dari class jumlah
        jumlah itung = new jumlah();
        System.out.println("\nPenjumlahan");
        // perhitungan penjumlahan
        System.out.println("Nilai A+B+C: "+ itung.Jumlah(count.getA(),count.getB(), count.getC()));

        // membuat object baru dari class rata2
        rata2 rata = new rata2();
        System.out.println("\nRata2");
        // perhitungan rata2
        System.out.println("Nilai (A+B+C)/ 3 : " + rata.Rata2(count.getA(), count.getB(), count.getC()));


        // membuat object baru dari class maxmin
        maxmin tinggirendah = new maxmin();
        // menjadikan A,B,C tipe data array
        int [] nilai = {count.A, count.B, count.C};

        System.out.println("Mencari nilai Max: ");
        // menampilkan nilai max
        int max = tinggirendah.max(nilai);
        System.out.println("Nilai max adalah: " + max);

        System.out.println("\nMencari nilai Min: ");
        // menampilkan nilai min
        int min = tinggirendah.min(nilai);
        System.out.println("Nilai Min adalah: "+ min);

    }
}
// class jumlah untuk penjumlahan, agar lebih mudah dipanggil dalam fungsi main
class jumlah extends Soaltwo{
    public int Jumlah(int a,int b,int c){
        return a+b+c;
    }
}

// class rata2 untuk merataratakan bilangan, agar lebih mudah dipanggil dalam fungsi main
class rata2 extends Soaltwo{
    public double Rata2(int a, int b, int c){
        return (double) (a+b+c)/(double) 3;
    }
}

// class maxmin untuk mencari nilai tertinggi dan terendah
class maxmin extends Soaltwo{
    // max
    public int max(int [] nils){
        // menggunakan perulangan for untuk mencari nilai tertinggi
        int max = nils[0];
        for(int i=1; i<nils.length;i++){
            if(max<nils[i]){
                max = nils[i];
            }
        }
        return max;
    }

    // min
    public int min(int [] nila){
        // menggunakan perulangan for untuk mencari nilai terkecil
        int min = nila[0];
        for(int i=1;i<nila.length;i++){
            if(min>nila[i]){
                min = nila[i];
            }
        }
        return min;
    }
}