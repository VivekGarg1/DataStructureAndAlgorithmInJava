package com.home.array;

public class ResizeAnArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity){
        int[] resizeArr = new int[capacity];
        for(int i = 0; i< arr.length; i++){
            resizeArr[i] = arr[i];
        }
        return resizeArr;
    }

    public static void main(String[] args) {
        ResizeAnArray resizeAnArray = new ResizeAnArray();
        int[] myArr = {3,7,4,7,10,6,5};
        resizeAnArray.printArray(myArr);
        myArr = resizeAnArray.resize(myArr,10);
        resizeAnArray.printArray(myArr);
    }
}
