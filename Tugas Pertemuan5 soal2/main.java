import java.util.*;
public class main {
    public static void main(String[] args) {
        Biodata mahasiswa = new Biodata();
        mahasiswa.inputData("Yeru","2021071033");
        mahasiswa.viewData();
        // mahasiswa merupakan object

        System.out.println("\n");
        Biodata nm = new Biodata();
        nm.inputData("Ziro","1111111");
        nm.viewData();
        // terlihat sama dengan yang ats tapi berbeda
    }
}
