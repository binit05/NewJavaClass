package day5;

public class ELseIf {
    public static void main(String[] args) {
        int marks= 95;
        if(marks >=88 && marks <= 100){
            System.out.println("Dinstinction");
        }

        else if(marks >=70 && marks <=79){
        System.out.println("first");
    }
        else if(marks >=40 && marks <=59){
            System.out.println("second");
        }
        else {
            System.out.println("fail");
        }
    }
}
