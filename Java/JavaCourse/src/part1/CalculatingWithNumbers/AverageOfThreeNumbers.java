package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number:");
        num1 = s.nextInt();
        System.out.println("Enter the second number:");
        num2 = s.nextInt();
        System.out.println("Enter the Third number");
        num3 = s.nextInt();
        System.out.println("Avg Is : "+(num1+num2+num3)/3);

    }
}
