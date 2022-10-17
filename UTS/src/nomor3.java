import java.util.Scanner;

class Input_bil {

    int sum = 0;

    public void input_data() {

        Scanner sc = new Scanner(System.in);

        int save[] = new int[10];


        for(int i = 0; i < save.length; i++)
        {
            System.out.print("Enter all the elements: ");
            save[i] = sc.nextInt();
            sum = sum + save[i];
        }

    }

    public double hasil() {
        double hasil_input = (sum);
        //System.out.println(hasil_input); => tidak parlu karena print sudah di class nomor 3
        return hasil_input;
    }

}



class nomor3 {

    public static void main(String[] args) {

        Input_bil masukkan = new Input_bil();
        masukkan.input_data();


        System.out.println("\033[H\033[2J");
        System.out.println("\nHasil Penjumlahan : " + masukkan.hasil());

        //System.out.println("total : " + ());


    }
}