package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hi, " + name + "! How old are you?");
        int age = scan.nextInt();
        int past = age - 5;
        int future = age + 5;
        System.out.println("Did you know that in five years you will be " + future
                + " years old?\nAnd five years ago you were " + past + "! Imagine that!");
    }
}
