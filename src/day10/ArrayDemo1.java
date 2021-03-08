package day10;


// array index= 0 to size-1
// arr.length -> gives size of an array
public class ArrayDemo1 {

    public static void main(String[] args) {
        //int arr [5]: -> in c and c++
        // <data type> [] <array name> = new <data type> [size of array]

        int [] arr = new int [3];  // here 3 is size of an array
        System.out.println(arr); // print object's id (euta proxy class ko)
        System.out.println(arr[0]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr[1]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr[2]); // default value dincha because aile kei assign garya chaina
        System.out.println(arr.length);





    }
}


// array: is a group of elements of same data type
// arranged in a sequential manner;