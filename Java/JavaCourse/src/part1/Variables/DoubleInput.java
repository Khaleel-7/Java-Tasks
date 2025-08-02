package part1.Variables;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num;
        System.out.println("Please Enter The Number!!!!!");
        num = s.nextDouble();
        System.out.println("you Gave The Number "+num);
    }
}
