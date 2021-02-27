package day3;

public class OperationDemo6 {
    public static void main(String[] args) {
        //6. Conditional(Ternary Operator)
        //  ?:

        int a=5;
        int b=6;
        if(a>b){
            System.out.println("a is greater than b");

        }
        else{
            System.out.println("b is greater than a");
        }

        System.out.println("==========");
        String s= (a>b)?"a is greater than b.":"b is greater than a";
        System.out.println(s);

        boolean r= (a>b)? true:false;
        System.out.println(r);

    }
}
