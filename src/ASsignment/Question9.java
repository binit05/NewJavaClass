package ASsignment;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner input= new Scanner((System.in));
        System.out.println("Enter number of pounds");
        double lbs= input.nextDouble();

        double kgConverted= 0.454*lbs;

        System.out.println("In kg it is: "+ kgConverted);
    }
}
