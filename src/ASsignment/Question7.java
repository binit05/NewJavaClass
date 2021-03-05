package ASsignment;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        int r= input.nextInt();
        System.out.println("Enter length of cylinder");
        int l= input.nextInt();

        double volume= (Math.PI)*(Math.pow(r,2)*l);
        int volumeAns= (int)volume;
        System.out.println("The volume is: "+volumeAns);
    }
}
