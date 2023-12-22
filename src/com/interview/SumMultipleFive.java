package com.interview;

public class SumMultipleFive {
    public static void main(String[] args) {
        int[] arr = {2,5,6,20,7,45};
        int total = 0;
        for(int value : arr) {
            if(value%5==0) {
                total+=value;
            }
        }
        System.out.println("Sum of Multiple of 5 is: "+total);
    }

}
