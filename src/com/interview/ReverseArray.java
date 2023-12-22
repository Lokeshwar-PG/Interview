package com.interview;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 9, 0, 5, 3, 4, 8, 7, 10};
        int length = numberArray.length;
//        int[] reverseArrray = new int[length];
        for(int i=length-1; i>=0; i--) {
            System.out.print(numberArray[i]+"\t");
        }

    }
}
