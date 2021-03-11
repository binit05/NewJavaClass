package ASsignment;

import java.util.Scanner;

public class Question36 {


    public int[] arrange (int b){
        Scanner in= new Scanner(System.in);
        int []arr= new int[b];
        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the element");
            arr[i]= in.nextInt();
        }
        return arr;
    }

    public int[] assending(int [] b,int delta){
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


    public void dublicate(int [] c,int delta){

        int firstElement=0;
        int finalS=0;
        int[] newarr= new int[delta];
        int j=0;
        for (int i=0; i<c.length;i++){

            if(i==0){
                firstElement=c[i];
            }

            if(i>0) {
                if (firstElement == c[i]) {
                    finalS+=1;
                    newarr[j]=c[i];
                    j++;
                } else {
                    firstElement = c[i];
                }
            }
        }

        System.out.println("The duplicate elemts are: ");
        for(int k=0; k<finalS;k++) {
            System.out.print(newarr[k] + " ");
        }
        }

       // return newarr;    }










    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int number= inp.nextInt();
        Question36 obj=new Question36();
        int [] array= obj.arrange(number);
        int [] sorted=obj.assending(array,number);


        obj.dublicate(sorted,number);


        //System.out.print("The duplicate element is: ");


    }
}
