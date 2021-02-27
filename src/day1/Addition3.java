package day1;

import javax.swing.*;

public class Addition3  {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter a:"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Enter b:"));
        int sum = a+b;
        System.out.println("Sum of a and b is: "+ sum);
        JOptionPane.showMessageDialog(null, "sum of a and b is: " +sum);
    }
}
