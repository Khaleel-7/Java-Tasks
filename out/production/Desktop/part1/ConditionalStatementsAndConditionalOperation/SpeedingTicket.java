package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int speed;
        System.out.println("Give The Speed");
        speed = s.nextInt();
        if (speed > 120) {
            System.out.println("Speeding Ticket!!!!!");
        }

    }
}
