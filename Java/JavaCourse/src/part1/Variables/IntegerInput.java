package part1.Variables;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Please Give The Number!!!!!");
         num = s.nextInt();
        System.out.println("You Gave The Number "+num);
    }
}
