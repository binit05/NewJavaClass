package ASsignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r= input.nextInt();
        System.out.println("Enter side1 of triange");
        int s1= input.nextInt();
        System.out.println("Enter side2 of triange");
        int s2= input.nextInt();
        System.out.println("Enter side3 of triange");
        int s3= input.nextInt();
        System.out.println("Enter length of rectangle");
        int l= input.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b= input.nextInt();

        double circle= 2* (Math.PI)* r;
        int triangle= s1+s2+s3;
        int rectangle= 2*(l+b);

        System.out.println("Circle ans: "+circle);
        System.out.println("Triangle ans: "+ triangle);
        System.out.println("Rectangle ans: "+ rectangle);


    }
}
