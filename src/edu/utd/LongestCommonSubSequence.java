package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/26/15.
 * This is an example of Dynamic Programming to find the longest common sub sequence of 2 input sequences of length m and n
 * Input:
 * 5 7
 * B D E F A
 * D A C E A F A
 * Output:
 * 4 E F A
 * D
 */
public class LongestCommonSubSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        Character[] inSeq1 = new Character[m];
        Character[] inSeq2 = new Character[n];
        for (int i = 0; i < m; i++) {
            inSeq1[i] = scanner.next(".").charAt(0);
        }
        for (int i = 0; i < n; i++) {
            inSeq2[i] = scanner.next(".").charAt(0);
        }
        int[][] LCS = new int[m][n];
        int[][] LCSConstructHelper = new int[m+1][n+1];

        System.out.println(LCSLength(m,n,inSeq1,inSeq2,LCSConstructHelper));
        printLCS(m,n,inSeq1,inSeq2,LCSConstructHelper);
    }

    private static void printLCS(int i, int j, Character[] inSeq1, Character[] inSeq2, int[][] lcsConstructHelper) {
        if(i==0 ||j==0){
            return;
        }
        if(lcsConstructHelper[i][j] == 1){
            printLCS(i-1,j-1,inSeq1,inSeq2, lcsConstructHelper);
            System.out.print(inSeq1[i-1]);

        }else if(lcsConstructHelper[i][j] == 0){
            printLCS(i-1,j,inSeq1,inSeq2,lcsConstructHelper);
        }else{
            printLCS(i,j-1,inSeq1,inSeq2,lcsConstructHelper);
        }
    }

    private static int LCSLength(int m, int n, Character[] inSeq1, Character[] inSeq2, int[][] lcsConstructHelper) {
        int[][] LCS = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if( i == 0 || j == 0){
                    LCS[i][j] = 0;
                }else if(inSeq1[i-1] == inSeq2[j-1]){
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                    lcsConstructHelper[i][j] = 1;
                }else if(LCS[i-1][j] >= LCS[i][j-1]){
                    LCS[i][j] = LCS[i-1][j];
                    lcsConstructHelper[i][j] = 0;
                }else{
                    LCS[i][j] = LCS[i][j-1];
                    lcsConstructHelper[i][j] = -1;
                }
            }

        }

        return LCS[m][n];
    }
}
