package part1.Variables;

import java.util.Scanner;

public class DifferentTypesofInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt;
        int x;
        double y;
        float z;
        boolean bool;
        System.out.println("Give A String");
        txt = s.nextLine();
        System.out.println("Give Integer");
        x = s.nextInt();
        System.out.println("Give Double");
        y = s.nextDouble();
        System.out.println("Give Floating Number");
        z = s.nextFloat();
        System.out.println("Give Boolean");
        bool = s.nextBoolean();
        System.out.println("You Gave : "+txt);
        System.out.println("You Gave : "+x);
        System.out.println("You Gave : "+y);
        System.out.println("You Gave : "+z);
        System.out.println("You Gave : "+bool);
    }
}
