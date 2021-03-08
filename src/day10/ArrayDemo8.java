package day10;

public class ArrayDemo8 {

    public static void main(String[] args) {
        String [][] names = {{"ram","shyam","hari"},{"mohan","gopal","krishna"},{"gita","sita","rita"}};

    for(int i=0; i < names.length; i++){
        for (int j=0; j< names.length; j++){
            System.out.print(names[i][j]+" ");
        }
        System.out.println();
    }
    }
}
