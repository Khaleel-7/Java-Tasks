package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("Enter age: ");
        k = s.nextInt();
        if(k >= 0 && k <= 120){
            System.out.println("Age is valid");
        }else{
            System.out.println("Age is not valid ///// Imposible");
        }
    }
}
