package day10;

public class ArrayDemo11 {

    public static void main(String[] args) {
        String[][] names = new String[][]{{"ram", "shyam", "hari"}, {"mohan", "gopal", "krishna"}, {"gita", "sita", "rita"}};

        for (String []name : names){
            for(String n:name){
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}
