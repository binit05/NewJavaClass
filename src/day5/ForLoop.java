package day5;

public class ForLoop {
    public static void main(String[] args) {
        int n=5;
        int sum= 0;
        for (int i=1;i <=n; i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum of nth number is: "+sum);
        System.out.println("==========");
    }
}
