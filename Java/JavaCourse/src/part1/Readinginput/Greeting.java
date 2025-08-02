package part1.Readinginput;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("What's Your Name???");
        name = s.nextLine();
        System.out.println("Hi "+name);
    }
}
