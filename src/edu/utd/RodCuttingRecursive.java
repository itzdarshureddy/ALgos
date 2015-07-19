package edu.utd;

/**
 * Created by dreddy on 7/16/15.
 */
public class RodCuttingRecursive {

    public static void main(String[] args) {

        int[] p = {-100,1,5,8,9,10,17,17,20,24,30,31,31,34,38,42,43,45,51,54,60,61,65,68,89,70,77,77,80,84,90,91,95,98,99,100,107,107,110,114,120};
        System.out.println(cutRod(p, 4));
    }

    private static int cutRod(int[] p, int n) {
        if(n == 0) return 0;
        int q = p[n];
        for (int i = 1; i < n; i++) {
            q = Math.max(q,p[i]+cutRod(p,n-i));

        }
        return q;
    }
}