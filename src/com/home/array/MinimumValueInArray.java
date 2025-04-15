package com.home.array;

/*
 * I/p: {3,2,4,7,10,6,5}
 * O/p: 2
 */
public class MinimumValueInArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int minimumValue(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(min > i)
                min = i;
        }
        return min;
    }

    public static void main(String[] args) {
        MinimumValueInArray minimumValueInArray = new MinimumValueInArray();
        int[] myArr = {3,2,4,7,10,6,5};
        minimumValueInArray.printArray(myArr);
        System.out.println(minimumValueInArray.minimumValue(myArr));
    }
}
