package day9;

public class ThisDemo4 {

    public ThisDemo4 getObject(){
        ThisDemo4 ob=new ThisDemo4();
       // return ob;

        //return new ThisDemo4();
        return this;
    }

    public void greet(){
        System.out.println("GOOD EVENING..");
    }

    public static void main(String[] args) {
        ThisDemo4 ob= new ThisDemo4();
        ThisDemo4 obj=ob.getObject();
        obj.greet();
    }


}
