package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the first number:");
        x = s.nextInt();
        System.out.println("Enter the second number:");
        y = s.nextInt();
        System.out.println("Addition IS : "+(x+y));
    }
}
