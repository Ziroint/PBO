public class MyClas {
    int x; // class attribute

    public MyClas(int y){
        x=y;
    }
    // Create a class constructor for the Myclas class
    public MyClas(){
        x = 5; // set the initial value for the class attribut x
    }

    public static void main(String[] args) {
        MyClas myObj = new MyClas(); //create an object of Class MyClas
        System.out.println(myObj.x);//print the value of x

        MyClas myObj1 = new MyClas(5);
        System.out.println(myObj1.x);
    }
}
