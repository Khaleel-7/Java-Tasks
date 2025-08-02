package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("Enter The User :");
        k = s.nextInt();
        if(k <= 2015){
            System.out.println("You entered "+k);
            System.out.println("Ancient History!!!!!!");
        }

    }
}
