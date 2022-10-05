public class MyClass3 {
    private int x = 10;//final
    private double PI = 3.14;//final

    public static void main(String[] args) {
        MyClass3 myObj = new MyClass3();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
