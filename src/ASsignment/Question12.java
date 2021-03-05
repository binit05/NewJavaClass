package ASsignment;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter roll number");
        int roll= input.nextInt();
        System.out.println("Enter Name");
        String name= input.next();
        System.out.println("Enter nationality");
        String national= input.next();

        System.out.println("Student name is: "+ name);
        System.out.println("Student roll is: "+ roll);
        System.out.println("Student nationality is: "+ national);

    }
}
