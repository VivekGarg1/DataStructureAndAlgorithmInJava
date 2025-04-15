package com.home.array;

/*
 * I/p: {3,2,4,7,10,6,5}
 * O/p: 7
 */
public class SecondMaximumInArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i > max){
                secondMax = max;
                max = i;
            }
            else if(i > secondMax && i != max){
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        SecondMaximumInArray secondMaximumInArray = new SecondMaximumInArray();
        int[] myArr = {3,2,4,7,10,6,5};
        secondMaximumInArray.printArray(myArr);
        System.out.println(secondMaximumInArray.secondMaximum(myArr));
    }
}
