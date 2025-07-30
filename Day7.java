/*
Problem Statement:

You are given two sorted arrays in non-decreasing order. Your task is to merge them into a single sorted array in non-decreasing order, without using any built-in sort function.

You must maintain the order and efficiently combine both arrays.

Input Format:
The first line contains an integer n — the size of the first array.
The second line contains n space-separated integers — the elements of the first array (sorted).
The third line contains an integer m — the size of the second array.
The fourth line contains m space-separated integers — the elements of the second array (sorted).

Constraints:
1 ≤ n, m ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Both arrays are already sorted in non-decreasing order.

Output Format:
Print a single line containing the merged sorted array with all elements separated by spaces.

Sample Input:
5
1 3 5 7 9
4
2 4 6 8

Sample Output:
1 2 3 4 5 6 7 8 9
*/

import java.io.*;
import java.util.*;

public class MergeSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        Integer arr1[] = new Integer[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        Integer arr2[] = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);

        for (int x : mergedList)
            System.out.print(x + " ");
    }
}
