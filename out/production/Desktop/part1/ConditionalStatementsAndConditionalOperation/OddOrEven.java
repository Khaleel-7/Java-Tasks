package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("Enter number: ");
        k = s.nextInt();
        if(k % 2 == 0){
            System.out.println("Even number is: "+k);
        }else{
            System.out.println("Odd number is: "+k);
        }
    }
}
