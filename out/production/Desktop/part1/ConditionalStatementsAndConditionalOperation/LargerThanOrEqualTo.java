package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter The First Number1 :");
        n1 = s.nextInt();
        System.out.println("Enter The Second Number2 :");
        n2 = s.nextInt();
        if(n1 > n2){
            System.out.println("Greater number is: "+n1);
        } else if (n1 < n2){
            System.out.println("Greater number is: "+n2);
        }else{
            System.out.println("SAME!!!!!!!!!!!!");
        }

    }
}
