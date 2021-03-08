package day9;


// shadowing: is the process of hiding instance variable by local variable
// inside non static method and constructor of a class

// this is a keyword and is an implicit reference variable of
// current type and current object
// and is available inside non-static method and constructor of a class
// we cannot change the value of 'this';

    public class ThisDemo1 {

    //instance variable
    int a= 5;

    //yesto ma ni shadowing huncha -> argument ni local variable nai ho tesaile
    public void m1 (int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    // yesma shadowing hudaina
   /* public static void a1(){
        int a=6;
        ThisDemo1 ob= new ThisDemo1();
        System.out.println(ob.a);

    }*/

    // shadowing huncha yesma
    public void print(){
        System.out.println("this is: "+this);
        System.out.println(a); // shadow na bhako bela-> this is same as System.out.println(this.a);
        //local variable
         a=24;  // -> same as int a =24;
        System.out.println(a);
        // paila ko a ko value dincha this garyo bhane
        System.out.println(this.a);
        int sum= this.a+a;
        System.out.println("Sum is: "+sum);
    }

    // cant do this( static lekhna mildaina)
   /* public static void print(){
        System.out.println(a);
    }*/

    public static void main(String[] args) {
        ThisDemo1 ob1= new ThisDemo1();
        System.out.println("Ob1 is: "+ ob1);
        ob1.print();
      //  ThisDemo1.a1();

        System.out.println("=========");
        ThisDemo1 ob2= new ThisDemo1();
        System.out.println("Ob2 is: "+ ob2);
        ob2.print();

        ob2.m1(9);
    }

}
