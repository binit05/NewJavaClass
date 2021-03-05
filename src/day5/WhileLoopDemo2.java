package day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean flag= true;
        System.out.println();

        while(flag){
            System.out.println("Enter name");
        String name= input.next();
            System.out.println("name is: "+ name);
            if (name.equals("binit")){
                flag=false;
            }
        }
        System.out.println("===================");
    }
}
