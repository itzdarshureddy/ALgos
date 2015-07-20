package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/20/15.
 * FInd the maximum subarray of the unsorted array comprising of positive and negative numbers in )(n)
 * input:
 * 5
 * 2 -3 3 -2 6
 *
 * Output:
 * 7
 *
 */
public class MaxContinuousSubArrayOrderN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int size = scanner.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }
        int maxSoFar = input[size-1];
        int maxLeft = input[size-1];
        for (int i = size-2; i >=0; i--) {
            maxSoFar = Math.max(input[i],Math.max(input[i]+maxLeft,maxSoFar));
            maxLeft = Math.max(maxLeft+input[i],input[i]);
        }

        System.out.println(maxSoFar);
    }
}
