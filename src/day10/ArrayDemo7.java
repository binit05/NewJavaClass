package day10;

import java.util.Scanner;

public class ArrayDemo7 {

    public static void main(String[] args) {
        final int Rows=3;
        final int Columns=3;

        int [] [] arr = new int [Rows][Columns];

        Scanner input = new Scanner((System.in));
        for (int i=0; i<Rows; i++){
            for(int j=0; j<Columns;j++){
                System.out.println("Enter: ");
                arr[i][j]=input.nextInt();
            }
        }


        for (int i=0; i< Rows; i++){
            for (int j=0; j<Columns;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
