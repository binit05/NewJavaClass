package ASsignment;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter byte value: ");
        byte b= input.nextByte();
        System.out.println("Enter short value: ");
        short s= input.nextShort();
        System.out.println("Enter int value: ");
        int i= input.nextInt();
        System.out.println("Enter long value: ");
        long l= input.nextLong();
        System.out.println("Enter float value: ");
        float f= input.nextFloat();
        System.out.println("Enter double value: ");
        double d= input.nextDouble();
        System.out.println("Enter boolean value: ");
        boolean bb= input.nextBoolean();
        System.out.println("Enter word: ");
        String s1= input.next();
        System.out.println("Enter line: ");
        String line = input.nextLine();
        System.out.println("Enter character value: ");
        char ch= input.next().charAt(0);

       // String s= input.next();
        //if(s.equals("F")){

        }
    }

