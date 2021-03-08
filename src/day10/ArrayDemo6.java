package day10;

import java.util.Scanner;

public class ArrayDemo6 {

    public static void main(String[] args) {
        final int Rows=3;
        final int Columns=3;

        int [] [] arr = new int [Rows][Columns];
        arr[0][0]=10;
        arr[0][1]=5;
        arr[0][2]=10;
        arr[1][0]=10;
        arr[1][1]=3;
        arr[1][2]=10;
        arr[2][0]=10;
        arr[2][1]=5;
        arr[2][2]=10;


        for (int i=0; i< Rows; i++){
            for (int j=0; j<Columns;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}

// 10 20 34
// 45 53 23
// 11 22 37
