package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            int randomInt = random.nextInt(100);
            intArray[i] = randomInt;
            System.out.println("Slot " + i + " contains a " + intArray[i]);
        }
    }
}
