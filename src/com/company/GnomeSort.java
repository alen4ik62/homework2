package com.company;

public class GnomeSort {

    public static int[] sort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (i == 0 || arr[i - 1] <= arr[i]) {
                i++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = tmp;
                i--;
            }
        }
        return arr;
    }
}
