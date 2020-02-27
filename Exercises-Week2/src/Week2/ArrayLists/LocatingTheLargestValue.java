package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        int largestNum = Integer.MIN_VALUE;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int ranNumber = random.nextInt(100);
            arrayList.add(ranNumber);
            if (largestNum < arrayList.get(i)) {
                largestNum = arrayList.get(i);
            }
        }
        System.out.println("ArrayList: " + arrayList);
    System.out.println("\nThe largest value is " + largestNum + " which is in slot " + arrayList.indexOf(largestNum));
    }
}
