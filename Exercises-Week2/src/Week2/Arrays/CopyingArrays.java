package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            int randomInt = random.nextInt(100);
            intArray[i] = randomInt;
        }
        int[] copiedArray = intArray.clone();
        intArray[intArray.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Array 2: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}
