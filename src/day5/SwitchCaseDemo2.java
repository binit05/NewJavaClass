package day5;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter you choice");
        char choice= input.next().charAt(0);

        switch(choice){

            case '+':
                System.out.println("addition");
                break;

            case '-':
                System.out.println("substraction");
                break;

            case '*':
                System.out.println("multiplication");
                break;

            case '/':
                System.out.println("division");
                break;

            default:
                System.out.println("panda");

        }

    }
    }

