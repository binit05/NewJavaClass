package day8;


//constructor overloading
// number of argument,type of argument, sequence of argument

public class User {


    String name;
    int age;


    public User(){
        System.out.println("default(no-arg) constructor");
    }

    public User(String n, int a){
        System.out.println("argumented (parameterized) constructor");
    }

    public static void main(String[] args) {
        User user1=new User();
        System.out.println("==========");
        User user2=new User("ram",23);
    }
}
