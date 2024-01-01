package ClassTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairsWithDifferenceK {
    public static int countPairsWithDifference(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            // Check if num - k or num + k exists in the map
            if (map.containsKey(num - k)) {
                count++;
            }
            if (map.containsKey(num + k)) {
                count++;
            }

            // Add num to the map with its count
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Divide by 2 to avoid double-counting each pair
        return count / 2;
    }

    public static void main(String[] args) {
        int k = 4;
        int[] arr = {7, 6, 23, 19, 10, 11, 9, 3, 15};
        int result = countPairsWithDifference(arr, k);
        System.out.println("Count of pairs with difference " + k + ": " + result);
    }
}
