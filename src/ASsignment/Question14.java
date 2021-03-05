package ASsignment;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input= new Scanner((System.in));
        System.out.println("Enter a number a");
        int a= input.nextInt();
        System.out.println("Enter number b");
        int b= input.nextInt();

        if (a>b){
            System.out.println("A is greater");
        }

        else if(a==b){
            System.out.println("Both are same");
        }
        else{
            System.out.println("B is greater");
        }

    }
}
