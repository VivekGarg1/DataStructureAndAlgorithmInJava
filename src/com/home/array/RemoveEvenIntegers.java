package com.home.array;

/*
* I/p: {3,2,4,7,10,6,5}
* O/p: {3,7,5}
*/
public class RemoveEvenIntegers {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] removeEven(int[] arr){
        int oddCount = 0;
        for (int k : arr) {
            if (k % 2 != 0)
                oddCount++;
        }
        int[] arrResult = new int[oddCount];
        int idx = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                arrResult[idx] = j;
                idx++;
            }
        }
        return arrResult;
    }

    public static void main(String[] args) {
        RemoveEvenIntegers removeEvenIntegers = new RemoveEvenIntegers();
        int[] myArr = {3,2,4,7,10,6,5};
        removeEvenIntegers.printArray(myArr);
        myArr = removeEvenIntegers.removeEven(myArr);
        removeEvenIntegers.printArray(myArr);
    }

}
