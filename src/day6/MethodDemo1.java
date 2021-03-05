package day6;

public class MethodDemo1 {

    // Method declaration definition
    public void sayHello() {
        System.out.println("Hello my Nepal");
    }

    public void displayInfo(String name, int age, double salary){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }

    public static void main(String[] args) {
        System.out.println("main");
        //method calling
        MethodDemo1 ob=new MethodDemo1();
        ob.sayHello();
        System.out.println("main end");

       ob.displayInfo("Ram", 22, 567.45);

       String n= "shyam";
       int a=11;
       double s=234.45;
       ob.displayInfo(n,a,s);
    }
}
