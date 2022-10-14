class OuterClass{
    int x = 10;

    class InnerClass{ // jika diubah menjadi private class maka tidak bisa diakses
        // jika diubah menjadi static class jadi tidak perlu membuat object
        int y = 5;
        public int jumlah(){
            return x+y;
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Hasil = "+ (myInner.y + myOuter.x));
        System.out.println("Hasil = " + myInner.jumlah());

    }
}