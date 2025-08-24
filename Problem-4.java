// Problem-4.java
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> multiples = new HashMap<>();

        // initialize map with 0 counts
        for (int i = 1; i <= 9; i++) {
            multiples.put(i, 0);
        }

        // check multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiples.put(i, multiples.get(i) + 1);
                }
            }
        }

        System.out.println(multiples);
    }
}
