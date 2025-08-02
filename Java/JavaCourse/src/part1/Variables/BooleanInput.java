package part1.Variables;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x;
        boolean bool = true;
        System.out.println("Write Something!!!!!");
        x = s.nextLine();
        System.out.println("True Or False???? "+bool);
        bool = s.nextBoolean();
    }
}
