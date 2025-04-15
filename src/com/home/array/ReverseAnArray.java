package com.home.array;

/*
 * I/p: {3,2,4,7,10,6,5}
 * O/p: {5,6,10,7,4,2,3}
 */
public class ReverseAnArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private void reverseArray(int[] myArr) {
        int start = 0;
        int end = myArr.length-1;
        while(start < end){
            int temp = myArr[start];
            myArr[start] = myArr[end];
            myArr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseAnArray reverseAnArray = new ReverseAnArray();
        int[] myArr = {3,2,4,7,10,6,5};
        reverseAnArray.printArray(myArr);
        reverseAnArray.reverseArray(myArr);
        reverseAnArray.printArray(myArr);
    }

}
