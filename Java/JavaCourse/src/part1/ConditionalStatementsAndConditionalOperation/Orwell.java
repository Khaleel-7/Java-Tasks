package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter The Number :");
        n = s.nextInt();
        if(n == 1983){
            System.out.println("You entered "+n);
            System.out.println("Orwell");
        }


    }
}
