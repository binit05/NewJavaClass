package day7;

public class StaticNonStaticTest {

    public static void main(String[] args) {
        StaticNonStaticDemo ob = new StaticNonStaticDemo();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        System.out.println(StaticNonStaticDemo.StaticVar);
        StaticNonStaticDemo.StaticMethod();
    }
}
