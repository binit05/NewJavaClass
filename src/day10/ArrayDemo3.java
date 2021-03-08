package day10;

import java.util.Scanner;

public class ArrayDemo3 {

    public static void main(String[] args) {
        //int arr [5]: -> in c and c++
        // <data type> [] <array name> = new <data type> [size of array]

        int [] arr = new int [3];  // here 3 is size of an array

        Scanner input = new Scanner((System.in));
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element: ");
            arr[i]= input.nextInt();
        }
      /*  System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
        int sum=0;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            sum= sum + arr[i];
        }

        System.out.println("Sum of array elements is: "+sum);



    }
}
