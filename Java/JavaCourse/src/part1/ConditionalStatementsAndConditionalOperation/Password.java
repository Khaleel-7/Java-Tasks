package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String j;
        System.out.println("Please enter your password: ");
        j =s.nextLine();
        if(j.equals("Caput Draconis")){
            System.out.println("Welcome!!!!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
