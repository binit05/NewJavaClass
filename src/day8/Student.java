package day8;

public class Student {
    //non static variable
    // instance variable, member's data, data,properties, attributes,field
    String name;
    int roll;

   /* public void assignInfo(String n, int r){
        name=n;
        roll=r;
    }*/

    public Student(String n, int r){
        name=n;
        roll=r;
        System.out.println("constructor called");
    }

    public void displayInfo(){
        System.out.println("name is: "+ name);
        System.out.println("roll is: "+roll);
    }
    public static void main(String[] args) {
        Student student1=new Student("ram",33);

        student1.displayInfo();


        student1.displayInfo();

        System.out.println("============");
        Student student2=new Student("shyam",23);

        student2.displayInfo();


        student2.displayInfo();
    }
}


//constructor: is a special function which has following features
//1. It's name is same as class name
//2. it has no return type
//3. we cannot use void keyword too
//4. it can have any access modifier
///5. it runs only once for each object
//6. It is mainly used to initialize the member data


//class: is a specification/template/model/prototype
// object: is an instance of a class which has properties and behaviour