package com.home.array;

public class AddOrUpdateArray {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddOrUpdateArray addOrUpdateArray = new AddOrUpdateArray();
        int[] myArr = new int[5];
        addOrUpdateArray.printArray(myArr);
        myArr[0] = 5;
        myArr[1] = 1;
        myArr[2] = 8;
        myArr[3] = 2;
        myArr[4] = 10;
        addOrUpdateArray.printArray(myArr);
        myArr[2] = 9; //updating array
        addOrUpdateArray.printArray(myArr);
        myArr[5] = 12;
        addOrUpdateArray.printArray(myArr);
    }

}
