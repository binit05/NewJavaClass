package ASsignment;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input the year");
        int year= input.nextInt();

        if(year % 4==0 && year%100==0 && year%400==0){
            System.out.println("it is a leap year");
        }
        else
            System.out.println("It is not a leap year");
    }
}
