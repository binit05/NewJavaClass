package day11;

import java.util.Scanner;

public class MethodDemo1 {

    public int[] returnArray (Scanner in){
        System.out.println("Enter size of an array: ");
        int size= in.nextInt();
        int [] arr= new int [size];
        for (int i=0; i< arr.length; i++){
            System.out.println("Enter a eleemt");
            arr[i]= in.nextInt();

          /*  int i=0;
            for(int ar:arr){
                System.out.println("Enter: ");
             arr[i]= in.nextInt();
             i++;
            }*/


        }
        return arr;
    }

    public void printElementsOfAnArray(int []arr){
        for(int a: arr){
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MethodDemo1 obj= new MethodDemo1();
        int [] arr= obj.returnArray(input);
        obj.printElementsOfAnArray(arr);
    }

}
