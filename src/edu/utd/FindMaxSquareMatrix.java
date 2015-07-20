package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/19/15.
 * Given a mXn matrix with zeros and ones this finds a max square matrix with all ones
 * Input:
 * 4 5
 * 0 1 1 0 0
 * 1 1 1 1 1
 * 0 1 1 1 1
 * 1 1 1 1 0
 *
 * Output:
 * 1 1 1
 * 1 1 1
 * 1 1 1
 */
public class FindMaxSquareMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] input = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0){
                    result[i][j] = input[i][j];
                }else {
                    if(input[i][j] == 0){
                        result[i][j] = 0;
                    }else{

                        result[i][j] = Math.min(result[i-1][j-1],Math.min(result[i-1][j],result[i][j-1]))+1;
                        if(max<result[i][j]){
                            max = result[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(max);

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print("1 ");
            }
            System.out.println("");
        }

    }
}
