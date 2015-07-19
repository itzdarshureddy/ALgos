package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/19/15.
 */
public class SortZeroOneTwos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int size = scanner.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }


        int low=0,mid=0,high=size;

        while (mid < high){
            if(input[mid] == 2){
                input[mid] = input[--high];
                input[high] = 2;
            }else if(input[mid] == 1){
                mid++;
            }else {

                if(low!=mid){
                    input[low++] = 0;
                    input[mid++] = 1;
                }else{
                    mid++;
                }
            }
        }

        //Output
        for (int i = 0; i < size; i++) {
            System.out.print(" "+input[i]);
        }

    }
}
