package edu.utd;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dreddy on 7/16/15.
 * Given 3 x N rectangle, determine how many ways can we tile the rectangle using 1x3 and 3x1 tiles
 * This is recursive approach for Dynamic Programming check Tile3XNRectangleWith1X3RectanglesDP
 * Input:
 * 4
 * Output:
 * 3
 */
public class Tile3XNRectangleWith1X3Rectangles {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int N = scanner.nextInt();
        System.out.println(findCount(N));

    }

    private  static double findCount(int N){
        if (N == 0){
            return 0;
        }else if(N == 1 || N == 2){
            return 1;
        }else if(N == 3){
            return 2;
        }else{
            return findCount(N - 1)+findCount(N - 3);
        }
    }
}
