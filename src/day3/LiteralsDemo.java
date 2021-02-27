package day3;

public class LiteralsDemo {
    public static void main(String[] args) {

        // Literals: fixed value+data type

        //1. Integer Literal 43543 67657 335 (int)

        byte b= 127;
        short s=32767;
        int i=2147483647;
        long l=2147483648L;
        long l2=2147483648L;
        long L3= 9223372036854775807L;

        //2. Floating Literal  45.67 2343.56 (double)
        float f=45.76F;
        double d= 45.76;

        //3. Boolean Literal true or false
        boolean b1= true;
        boolean b2=false;

        //4. Character Literal 'a' '1' '?'
        char c1= 'a';
        char c2= '1';
        char c3= '#';
        char c4= '\u0001'; //unicode ma lekhna parcha

        // 5. String Literal "saf' ""
        String s1= "binit";
        String s2= "abc@123#T5";
        String s3="";
        String s4= " ";
        String s5= "123";
        String s6= "34.46";
        String s7="true";
        String s8= "Hello, I am Binit Sthapit. I am from Nepal. I am Java Developer";
        String s9= "2011-01-11";

        //6. Null Literals

        String s10=null;

        LiteralsDemo obj= new LiteralsDemo(); // this is an object in java
        LiteralsDemo ob=null;




    }
}
