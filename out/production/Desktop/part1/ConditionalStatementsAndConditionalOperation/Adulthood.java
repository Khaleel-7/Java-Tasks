package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("How Old Are You?????????");
        k = s.nextInt();
        if(k >= 18){
            System.out.println("You Are An Adulthood");
        }else{
            System.out.println("You Are Not An Adulthood");
        }
    }
}
