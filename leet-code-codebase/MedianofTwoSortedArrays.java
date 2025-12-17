//Leetcode question number 4

import java.util.*;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            arr3[k++] = arr[i];
        }

        for (int i = 0; i < m; i++) {
            arr3[k++] = arr2[i];
        }

        Arrays.sort(arr3);

        if (arr3.length % 2 == 0) {
            double median = (arr3[arr3.length / 2 - 1] + arr3[arr3.length / 2]) / 2.0;
            System.out.println(median);
        } else {
            System.out.println(arr3[arr3.length / 2]);
        }
    }
}
