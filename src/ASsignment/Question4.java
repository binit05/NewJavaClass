package ASsignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner newInput= new Scanner(System.in);
        System.out.println("Enter P");
        int p= newInput.nextInt();

        System.out.println("Enter T");
        int T= newInput.nextInt();

        System.out.println("Enter R");
        int R= newInput.nextInt();

        int interest= ((p*T*R)/100);
        System.out.println(interest);
    }


}
