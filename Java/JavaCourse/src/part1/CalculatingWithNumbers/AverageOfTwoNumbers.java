package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number:");
        num1 = s.nextInt();
        System.out.println("Enter the second number:");
        num2 = s.nextInt();
        System.out.println("Avg IS : "+(num1+num2)/2);

    }
}
