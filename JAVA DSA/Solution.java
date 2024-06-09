import java.io.*;
import java.util.*;

public class Solution {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];

            int currentArea = Math.min(hLeft, hRight) * (right - left);

            maxArea = Math.max(maxArea, currentArea);

            if (hLeft < hRight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int result = maxArea(heights);
        System.out.println(result);

        scanner.close();
    }
}