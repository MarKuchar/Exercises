package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hi, " + name + "! How old are you?");
        int age = scan.nextInt();

        System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "?");
        float wage = scan.nextFloat();
        System.out.printf("%.1f! I hope that's per hour and not per year! LOL!", wage);
    }
}
