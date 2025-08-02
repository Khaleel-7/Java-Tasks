package part1.Readinginput;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String message;
        System.out.println("Please Enter The String\n");
        message = s.nextLine();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

    }


}
