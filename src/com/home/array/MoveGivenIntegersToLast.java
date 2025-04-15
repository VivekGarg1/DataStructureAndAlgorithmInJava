package com.home.array;

/*
 * I/p: {3,7,4,7,10,6,5} if move 7 to last
 * O/p: {3,4,10,6,5,7,7}
 */
public class MoveGivenIntegersToLast {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void moveIntegersToLast(int[] arr, int lastValue){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != lastValue && arr[j] == lastValue){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != lastValue)
                j++;
        }
    }

    public static void main(String[] args) {
        MoveGivenIntegersToLast moveGivenIntegersToLast = new MoveGivenIntegersToLast();
        int[] myArr = {3,7,4,7,10,6,5};
        moveGivenIntegersToLast.printArray(myArr);
        moveGivenIntegersToLast.moveIntegersToLast(myArr,7);
        moveGivenIntegersToLast.printArray(myArr);
    }

}
