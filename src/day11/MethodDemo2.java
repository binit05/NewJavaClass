package day11;

public class MethodDemo2 {

    public void printElementsOfAnArray(int ...arr){
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void main (String[] args){
        int [] arr = {10,20,30};

        MethodDemo2 ob =new MethodDemo2();
        ob.printElementsOfAnArray(arr);
        ob.printElementsOfAnArray(new int[]{40,50,60});
        ob.printElementsOfAnArray(40,50,60,70,70);


    }



}
