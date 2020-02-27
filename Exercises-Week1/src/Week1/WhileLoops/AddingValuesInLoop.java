package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("I will add up the numbers you give me.\nNumber: ");
        int num = scan.nextInt();
        while (num != 0) {
            sum += num;
            System.out.print("The total so far is " + sum +"\nNumber: ");
            num = scan.nextInt();
        }
        System.out.println("\nThe total is " + sum);
    }
}
