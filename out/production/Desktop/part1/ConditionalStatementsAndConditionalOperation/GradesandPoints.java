package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        System.out.println("Enter the Grade of students : ");
        k = s.nextInt();
        if(k < 0){
            System.out.println("Imposible!!!!");
        }else if(k >= 0 && k <= 49){
            System.out.println("Failed!!!");
        }else if(k >= 50 && k <= 59){
            System.out.println("1!!!");
        }else if(k >= 60 && k <= 69){
            System.out.println("2!!!");
        }else if(k >= 70 && k <= 79){
            System.out.println("3!!!");
        }else if(k >= 80 && k <= 89){
            System.out.println("4!!!");
        }else if(k >= 90 && k < 100){
            System.out.println("5!!!");
        }else{
            System.out.println("Incredible!!!!!");
        }

    }
}
