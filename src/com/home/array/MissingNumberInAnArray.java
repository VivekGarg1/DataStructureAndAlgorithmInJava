package com.home.array;

/*
 * I/p: {3,8,2,1,6,5,7}
 * O/p: 4
 */
public class MissingNumberInAnArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int missingNum(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int i : arr){
            sum = sum - i;
        }
        return sum;
    }

    public static void main(String[] args) {
        MissingNumberInAnArray missingNumberInAnArray = new MissingNumberInAnArray();
        int[] myArr = {3,8,2,1,6,5,7};
        missingNumberInAnArray.printArray(myArr);
        System.out.println(missingNumberInAnArray.missingNum(myArr));
    }
}
