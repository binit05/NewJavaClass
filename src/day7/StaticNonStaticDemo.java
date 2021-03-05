package day7;

public class StaticNonStaticDemo {

    String nonStaticVar= "this is non-static variable";
    static String StaticVar= "this is static variable";

    public void nonStaticMethod(){
        System.out.println("this is non-static method");
    }

    public static void StaticMethod(){
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        //non static
        StaticNonStaticDemo ob= new StaticNonStaticDemo();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        //static
        System.out.println(StaticVar);
        StaticMethod();

        //best way
        System.out.println(StaticNonStaticDemo.StaticVar);
        StaticNonStaticDemo.StaticMethod();






        //local variable
        int a=5;
        String name="Ram";
    }
}

// block => {}