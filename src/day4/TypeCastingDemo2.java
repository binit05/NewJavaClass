package day4;

public class TypeCastingDemo2 {
    public static void main(String[] args) {
        char c1=96;
        byte b1= (byte)c1;

        System.out.println(c1);
        System.out.println(b1);

        char c2= 'a';
        byte b2='a';
        System.out.println(c2);
        System.out.println(b2);

        System.out.println("=======");
        char c3= 77;
        byte b3=(byte)c3;
        System.out.println(c3);
        System.out.println(b3);
        System.out.println("=======");

        byte b4=88;
        char c4=(char)b4;
        System.out.println(b4);
        System.out.println(c4);

    }
}
