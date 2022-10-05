import java.util.*;


public class luaslingkaran {
    private int r;
    public void setjari2(int jari2){
        this.r = jari2;
    }
    public double luasL(){
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        luaslingkaran lingkaran = new luaslingkaran();

        // jari2
        System.out.print("Jari-jari lingkaran = ");
        lingkaran.setjari2(input.nextInt());

        //luas
        System.out.println("Luas Lingkaran = " + Math.PI +" * "+ lingkaran.r +" * " + lingkaran.r +" = "+ lingkaran.luasL());


    }
}
