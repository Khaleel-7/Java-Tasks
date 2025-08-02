package part1.Readinginput;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resp1,resp2;
        System.out.println("Greetings! How are you doing?");
        resp1 = s.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        resp2 = s.nextLine();
        System.out.println("Thanks for sharing!");


    }
}
