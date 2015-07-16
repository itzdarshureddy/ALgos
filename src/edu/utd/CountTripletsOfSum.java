package edu.utd;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dreddy on 7/16/15.
 * this program finds number of triplets(3 elements) in unsorted array that add up to specified sum. assuming that all elements are UNIQUE
 * Example
 * Input:
 * 8 6 4 7 5
 * 18
 *
 * Output:
 * Total number of triplets is :2
 */
public class CountTripletsOfSum {

    public static void main(String[] args){
        //Read the input

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String nextLine = scanner.nextLine();
        String[] inputStr = nextLine.split(" ");
        int[] input = new int[inputStr.length];
        for(int i =0; i<input.length;i++){
            input[i]=Integer.parseInt(inputStr[i]);
        }
        int requiredSum = scanner.nextInt();

        //First sort the unsorted input array, O(nlgn)
        Arrays.sort(input);
        //code to count the triplets O(n^2), hence total complexity is O(n^2)
        int noOfTriplets = 0;

        for (int i = 0; i < input.length; i++) {
            int remainingSum = requiredSum-input[i];
            int j=i+1,k=input.length-1;
            while(j<k){
                if(input[j]+input[k]==remainingSum){
                    noOfTriplets++;
                    j++;
                    k--;
                }else if(input[j]+input[k] < remainingSum){
                    j++;
                }else {
                    k--;
                }

            }

        }


        System.out.println("Total number of triplets is :"+noOfTriplets);



    }

}
