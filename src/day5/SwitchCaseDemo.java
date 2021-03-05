package day5;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter you choice");
        int choice= input.nextInt();

        switch(choice){

            case 1:
                System.out.println("addition");
                break;

                case 2:
                System.out.println("substraction");
                break;

                case 3:
                System.out.println("multiplication");
                break;

                case 4:
                System.out.println("division");
                break;

            default:
                System.out.println("panda");

        }

    }
}
