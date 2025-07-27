package Coding30Day;

import java.util.*;

/**
 * Day 5 - Character Frequency Counter
 *
 * Problem:
 * Given a non-empty string S that may contain letters (uppercase and lowercase),
 * digits, spaces, and special characters, perform the following:
 *   - Ignore all spaces.
 *   - Convert all letters to lowercase.
 *   - Count the frequency of each character (only letters and digits).
 *   - Print the characters and their frequencies in sorted order (digits 0–9, then a–z).
 *
 * Sample Input:
 * Hello World! 123
 *
 * Sample Output:
 * 1 : 1
 * 2 : 1
 * 3 : 1
 * d : 1
 * e : 1
 * h : 1
 * l : 3
 * o : 2
 * r : 1
 * w : 1
 *
 * Author: [Your Name]
 * Date: [Upload Date]
 */

public class Day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input from the user
        String input = sc.nextLine();

        // Step 1: Remove all spaces
        String noSpaces = input.replaceAll(" ", "");

        // Step 2: Convert to lowercase
        String lowerCase = noSpaces.toLowerCase();

        // Step 3: Remove special characters (keep only letters and digits)
        String cleaned = lowerCase.replaceAll("[^a-z0-9]", "");

        // Step 4: Use TreeMap to count characters in sorted order
        TreeMap<Character, Integer> freqMap = new TreeMap<>();

        for (char ch : cleaned.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 5: Print results
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}

