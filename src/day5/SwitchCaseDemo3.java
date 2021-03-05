package day5;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter you choice");
        String choice= input.next();

        switch(choice){

            case "add":
                System.out.println("addition");
                break;

            case "substract":
                System.out.println("substraction");
                break;

            case "mulitplication":
                System.out.println("multiplication");
                break;

            case "division":
                System.out.println("division");
                break;

            default:
                System.out.println("panda");

        }

    }
    }

