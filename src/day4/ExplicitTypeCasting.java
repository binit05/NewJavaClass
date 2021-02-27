package day4;

public class ExplicitTypeCasting {

//explicit
// double=> float=> long=> int => short => byte

    public static void main(String[] args) {
        double d= 100.98;
        float f= (float)d;
        long l=(long)f;
        short s=(short)l;
        byte b=(byte)s;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(s);
        System.out.println(b);
    }



}
