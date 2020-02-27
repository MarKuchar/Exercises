package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < intArray.length; i++) {
            int ranNumber = random.nextInt(100);
            intArray[i] = ranNumber;
            System.out.print(intArray[i] + " ");
        }
        int largeNum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (largeNum < intArray[i]) {
                largeNum = intArray[i];
            }
        }
        System.out.println("\n");
        System.out.println("The largest value is " + largeNum);
    }
}
