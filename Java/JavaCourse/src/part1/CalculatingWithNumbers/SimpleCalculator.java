package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number:");
         num1 = s.nextInt();
        System.out.println("Enter the second number:");
         num2 = s.nextInt();
         int sum = num1 + num2;
         int differnent = num1 - num2;
         int mult = num1 * num2;
         int div = num1 / num2;
         int mod = num1 % num2;
        System.out.println("Sum is : "+sum);
        System.out.println("Difference is : "+differnent);
        System.out.println("Multiplication is : "+mult);
        System.out.println("Division is : "+div);
        System.out.println("Modulo is : "+mod);


    }
}
