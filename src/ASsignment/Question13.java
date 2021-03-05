package ASsignment;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = input.nextInt();

        while(a>0){
            System.out.println("Re Enter num");
            a= input.nextInt();
        }

        System.out.println("Entered numbver by user: "+a);


    }
}
