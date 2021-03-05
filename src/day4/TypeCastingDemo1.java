package day4;

public class TypeCastingDemo1 {
    public static void main(String[] args) {

        byte b1=127;
        // by java compiler
        int i1= b1; //implicit type casting (conversion)
        System.out.println(i1);
        System.out.println(b1);

        System.out.println("============");

        int i2= 127;
        // by java programmer
        byte b2=(byte)i2; // explicit type casting (conversion)
        System.out.println(i2);
        System.out.println(b2);


        System.out.println("============");
        int i3=200;
        byte b3=(byte)i3;
        System.out.println(i3);
        System.out.println(b3);
    }
}


