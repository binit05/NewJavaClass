package day6;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for (int j=1;j<=3;j++){

                if (j==3){
                    break;
                }
                System.out.println(i+""+j);
            }
            System.out.println();
        }
        System.out.println("out form loop");
    }
}
