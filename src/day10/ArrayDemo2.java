package day10;

public class ArrayDemo2 {


    public static void main(String[] args) {


        int [] arr = new int [3];  // here 3 is size of an array
        System.out.println(arr); // print object's id (euta proxy class ko)
        System.out.println(arr[0]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr[1]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr[2]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr.length);

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);




    }
}
