package ASsignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question10a {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of u");
        double u= input.nextDouble();
        System.out.println("Enter value of t");
        double t= input.nextDouble();
        System.out.println("Enter value of a");
        double a= input.nextDouble();

        double s= u*t+(1.0/2.0)*a*(Math.pow(t,2));
        System.out.println("Answer is: "+s);
    }
}
