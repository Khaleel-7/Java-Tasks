package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2;
        System.out.println("Please Enter The First Number :");
        n1 = s.nextInt();
        System.out.println("Please Enter The Second Number :");
        n2 = s.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum Is : "+sum);
    }
}
