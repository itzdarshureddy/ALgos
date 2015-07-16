package edu.utd;

public class FindMaxInArray {

    public static void main(String[] args) {

        int[] input= {3,5,354,1,6,7,4,6,9,11,3243,4,-4,66};
        System.out.println("Max element is "+findMax(input,0,input.length-1));
    }

    public static int findMax(int[] array, int low,int high){

        if(low==high){
            return array[low];
        }

        int mid = (low+high)/2;

        int leftMax = findMax(array,low,mid);
        int rightMax = findMax(array,mid+1, high);
        return Math.max(leftMax,rightMax);

    }

}
