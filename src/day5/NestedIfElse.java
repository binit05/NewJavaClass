package day5;

public class NestedIfElse {
    public static void main(String[] args) {
        int a=4;
        int b=13;
        int c=5;

        if(a>b) {
            if (a > c) {
                System.out.println("a is largest one");
            } else {
                System.out.println("c is greatest");
            }
        }
        else{
                System.out.println("a is smaller than b but c maybe greater or smaller");
            }
        }

    }

