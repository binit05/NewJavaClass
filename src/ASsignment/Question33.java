package ASsignment;

import java.util.Scanner;

public class Question33 {

    public int[] arra(int a){

        Scanner input= new Scanner(System.in);
            int [] arr= new int[a];

            for(int i=0; i< arr.length; i++){
                System.out.println("Enter the element");
                arr[i]= input.nextInt();
            }

        return arr;
    }


    public int[] arrange(int [] b,int delta){
        int binit=0;
        int counter=0;
        int c = 0;
        while(counter !=delta) {
            for (int i = 0; i < b.length; i++) {

                if (i == 0) {
                    binit = b[i];
                }

                if (i > 0) {
                    if (binit > b[i]) {

                        c = binit;
                        binit = b[i];

                        b[i - 1] = b[i];
                        b[i] = c;
                        binit=c;
                    }

                    else {
                        binit = b[i];
                    }
                }
            }
            counter+=1;
        }
        return b;
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter how many elements");
        int number= in.nextInt();;
        Question33 obj= new Question33();
        int [] value=obj.arra(number);
        obj.arrange(value,number);

        for(int a:value) {
            System.out.print(a+" ");
        }
    }
}
