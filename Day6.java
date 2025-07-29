import java.util.*;

/**
 * Problem:
 * Given an array of integers, remove all duplicate elements while preserving
 * the order of first occurrence.
 *
 * Input Format:
 * - First line: Integer n (number of elements)
 * - Second line: n space-separated integers
 *
 * Output:
 * - Print the unique elements in their original order, separated by spaces.
 *
 * Sample Input:
 * 8
 * 1 2 3 2 1 4 5 3
 *
 * Sample Output:
 * 1 2 3 4 5
 *
 * Author: [Your Name]
 * Date: [Upload Date]
 */

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Read the number of elements
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Read n integers and add to LinkedHashSet to remove duplicates
        // and maintain insertion order
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Print the unique elements in original order
        for (int num : set) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

