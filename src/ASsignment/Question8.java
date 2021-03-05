package ASsignment;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Choice 1 to change C to F or 2 to change F to C");
        int choice= input.nextInt();
        double Answer=0;

        switch(choice){

            case 1:
                System.out.println("Enter Celsius Value");
                double celsius= input.nextDouble();
                Answer= celsius*(9.0/5.0)+32;
                break;
            case 2:
                System.out.println("Enter Fahrenheit value");
                double Fah= input.nextDouble();
                Answer= ((Fah-32)*(5.0/9.0));
                break;
            default:
                Answer= 1;

        }


        System.out.println("Answer is: " + Answer);

    }
}
