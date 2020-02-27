package Week2.Arrays;

import org.omg.CORBA.INTERNAL;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        int largestNum = Integer.MIN_VALUE;
        int slotNum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < intArray.length; i++) {
            int ranNumber = random.nextInt(100);
            intArray[i] = ranNumber;
            System.out.print(intArray[i] + " ");
            if (intArray[i] > largestNum) {
                largestNum = intArray[i];
                slotNum = i;
            }
        }

        System.out.println("\n\nThe largest value is " + largestNum);
        System.out.println("It is in slot " + slotNum);

    }
}
