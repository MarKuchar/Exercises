package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int ranNumber = random.nextInt(50);
            arrayList.add(ranNumber);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.print("Value to find: ");
        int valueToFind = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(valueToFind)) {
                System.out.println(valueToFind + " is in the ArrayList.");
            }
        }
    }
}
