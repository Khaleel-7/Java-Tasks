package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("Enter The User :");
        k = s.nextInt();
        if(k > 0){
            System.out.println("The Number Is Positive");
        }else{
            System.out.println("The Number Is Negative");
        }

    }
}
