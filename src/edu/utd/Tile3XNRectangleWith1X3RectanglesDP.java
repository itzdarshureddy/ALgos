package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/16/15.
 * Given 3 x N rectangle, determine how many ways can we tile the rectangle using 1x3 and 3x1 tiles
 * This is Dynamic Programming approach
 * Input:
 * 4
 * Output:
 * 3
 */
public class Tile3XNRectangleWith1X3RectanglesDP {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int N = scanner.nextInt();
        double[] tilesPerN = new double[N+1];

        for(int i=1;i<=N;i++){
            if(i==1 || i == 2){
                tilesPerN[i] = 1;
            }else if(i == 3){
                tilesPerN[i] = 2;
            }
            else{
                tilesPerN[i] = tilesPerN[i-1]+tilesPerN[i-3];
            }
        }

        System.out.println(tilesPerN[N]);
    }

}
