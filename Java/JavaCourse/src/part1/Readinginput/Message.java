package part1.Readinginput;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String message;
        System.out.println("Please Enter The String");
        message = s.nextLine();
        System.out.println(message);
    }
}
