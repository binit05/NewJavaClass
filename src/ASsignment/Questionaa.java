package ASsignment;

import java.util.Scanner;

//demo
public class Questionaa {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a: ");
        double a=input.nextDouble();
        System.out.println("enter b: ");
        double b=input.nextDouble();
        System.out.println("enter c: ");
        double c=input.nextDouble();


        double s= (a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

    }
}
