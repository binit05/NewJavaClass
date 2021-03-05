package ASsignment;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r= input.nextInt();
        System.out.println("Enter length of rectangle");
        int l=input.nextInt();
        System.out.println("Enter width of rectangle");
        int w= input.nextInt();
        System.out.println("Enter breadth of triangle");
        int b=input.nextInt();
        System.out.println("Enter height of triangle");
        int h= input.nextInt();


        double areaOfCircle= ((Math.PI)*((Math.pow(r,2))));
        double areaOfRect= l*w;
        float areaOfTri= (float)(1.0/2.0);

        System.out.println("The area of circle: "+ areaOfCircle);
        System.out.println("The area of Rectangle: "+ areaOfRect);
        System.out.println("The area of Triangle: "+ areaOfTri);


    }
}
