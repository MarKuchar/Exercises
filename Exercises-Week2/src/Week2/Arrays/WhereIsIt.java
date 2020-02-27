package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < intArray.length; i++) {
            int randomInt = random.nextInt(50);
            intArray[i] = randomInt;
            System.out.print(intArray[i] + " ");
        }
        System.out.print("\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Value to find: ");
        int scanNumber = scan.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == scanNumber) {
                System.out.println();
                System.out.println(intArray[i] + " is in slot " + i + ".");
                isPresent = true;
            } else if (i == intArray.length - 1 && !isPresent){
                System.out.println();
                System.out.println(scanNumber + " is not in the array.");
            }
        }
    }

}
