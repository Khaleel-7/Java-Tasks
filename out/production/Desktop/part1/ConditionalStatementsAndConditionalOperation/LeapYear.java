package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Year;
        System.out.println("Enter age: ");
        Year = s.nextInt();
        if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
