package day9;

public class ThisDemo2 {

    String name;
    int age;

    public ThisDemo2(String name, int age){
       // numm and 0 aucha kina ki mathi ko kei value nai  assigned chaina
       /* name=name;
        age=age;
        */


        /// MANISH WHY?
       /* name="binit";
        age=24;*/

        this.name=name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);

    }

    public static void main(String[] args) {
        ThisDemo2 ob1= new ThisDemo2("raju",22);
        ob1.displayInfo();
    }


}
