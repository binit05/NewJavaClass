package ASsignment;

import java.util.Scanner;

public class Question35 {

    public int[] arra(int a) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element");
            arr[i] = input.nextInt();
        }

        return arr;
    }


    public int[] arrange(int[] b, int delta) {
        int binit = 0;
        int counter = 0;
        int c = 0;
        int length = b.length;
        while (counter != delta) {
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
                        binit = c;
                    } else {
                        binit = b[i];
                    }
                }
            }
            counter += 1;
        }

        // System.out.println(b[b.length-1]);
        // System.out.println(b);;
        return b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements");
        int number = in.nextInt();
        ;
        Question35 obj = new Question35();
        int[] value = obj.arra(number);
        int[] poo = obj.arrange(value, number);
        System.out.println();
        System.out.print("the array in assending is: ");
        for (int zz : poo) {

            System.out.print(zz + " ");
        }
        System.out.println();
        for (int i = 0; i < poo.length; i++) {

            if (i == poo.length - 2) {
                System.out.println("The second largest element is: " + poo[i]);
            }

        }
    }
}
        //}


