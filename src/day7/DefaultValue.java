package day7;

public class DefaultValue {

    static byte b;
    short s;
    int i;
    float f;
    double d;
    boolean bb;
    static String ss;
    DefaultValue ob;

    public static void main(String[] args) {
        DefaultValue obj= new DefaultValue();
        System.out.println(b);
        System.out.println(obj.s);
        System.out.println(obj.i);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.bb);
        System.out.println(ss);
    }

}
