package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int ranNumber = random.nextInt(100);
            arrayList.add(ranNumber);
        }
        System.out.println("ArrayList: " + arrayList);
    }
}
