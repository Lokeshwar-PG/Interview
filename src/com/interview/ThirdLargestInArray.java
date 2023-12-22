package com.interview;

import java.util.Arrays;

public class ThirdLargestInArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 9, 0, 5, 3, 4, 8, 10};
        for(int i=0; i<numberArray.length-1; i++) {
            for(int j=i+1; j<numberArray.length-1; j++) {
                if(numberArray[j]>numberArray[j+1]) {
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = temp;
                }
            }
        }
        System.out.println("Third Largest element in arrat is: " + numberArray[numberArray.length - 3]);


        Arrays.sort(numberArray);
        System.out.println("Third Largest element in arrat is: " + numberArray[numberArray.length - 3]);


        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=0; i<numberArray.length; i++) {
            if(numberArray[i]>max) {
                max3 = max2;
                max2 = max;
                max = numberArray[i];
            }
            else if(numberArray[i]<max && numberArray[i]>max2) {
                max3 = max2;
                max2 = numberArray[i];
            }
            else if(numberArray[i]<max2 && numberArray[i]>max3) {
                max3 = numberArray[i];
            }
        }
        System.out.println("Third Largest element in arrat is: "+max3);
    }
}

