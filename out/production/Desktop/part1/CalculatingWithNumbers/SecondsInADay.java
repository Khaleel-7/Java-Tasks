package part1.CalculatingWithNumbers;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int days;
        System.out.println("How many days would you like to convert to seconds?");
        days = s.nextInt();
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
    }
}
