package ASsignment;

import day8.Student;

import java.util.Scanner;

public class TRRRRY {

        //non static variable
        // instance variable, member's data, data,properties, attributes,field
        String name;
        int roll;

   /* public void assignInfo(String n, int r){
        name=n;
        roll=r;
    }*/

        public TRRRRY(String n){
            name=n;
            System.out.println("constructor called");
        }

        public void displayInfo(){
            System.out.println("name is: "+ name);
            //System.out.println("roll is: "+roll);
        }
        public static void main(String[] args) {


            Scanner inpp= new Scanner((System.in));
            System.out.println("KATI CHOTI");
            int choti= inpp.nextInt();
            int plus=0;
            String  param="student"+plus;

            for (int i=1; i<=choti;i++){
                System.out.println("NAME HAL ");
                String namhale= inpp.next();
                TRRRRY student1=new TRRRRY(namhale);

                student1.displayInfo();

            }



            //student1.displayInfo();

            System.out.println("============");
            TRRRRY student2=new TRRRRY("shyam");

            student2.displayInfo();


            student2.displayInfo();
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

}
