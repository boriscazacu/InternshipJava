package com.company;

public class Array {
    public int[] addNew(int[] arr, int element, int position){
        int[] newArray = new int[arr.length+1];
        int j = 0;

        for (int i=0; i<arr.length+1; i++){
            if (i == position-1){
                newArray[i] = element;
            }else {
                newArray[i] = arr[j];
                j++;
            }
        }
        return newArray;
    }

    public void printArray(int[] array){
        for (int value: array) {
            System.out.print(value + " ");
        }
    }
}
