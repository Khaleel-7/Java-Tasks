package part1.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String m,n;
        System.out.println("Enter The First String");
        m = s.nextLine();
        System.out.println("Enter The Second String");
        n = s.nextLine();
        if(m.equals(n)){
            System.out.println("Same!!!");
        }else{
            System.out.println("Not Same /// Different!!!");
        }

    }
}
