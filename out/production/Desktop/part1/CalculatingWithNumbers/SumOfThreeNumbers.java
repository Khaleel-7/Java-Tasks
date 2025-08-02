package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter the first number:");
        n1 = s.nextInt();
        System.out.println("Enter the second number:");
        n2 = s.nextInt();
        System.out.println("Enter the third number:");
        n3 = s.nextInt();
        System.out.println("Sum IS : "+(n1+n2+n3));


    }
}
