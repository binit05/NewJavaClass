package ASsignment;

import java.util.Scanner;

public class Question32 {

    public int[] value(int b){
        Scanner in= new Scanner((System.in));

        int [] arr= new int[b];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the element");
            arr[i]= in.nextInt();

        }
        return arr;
    }


    public void disp(int [] b) {
        for (int bbb : b) {
            System.out.println("The array is: " + bbb);
        }
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner((System.in));
        System.out.println("Enter how many elements");
        int elem= inp.nextInt();
        Question32 obj= new Question32();
        int [] binit=obj.value(elem);
        obj.disp(binit);



    }
}
