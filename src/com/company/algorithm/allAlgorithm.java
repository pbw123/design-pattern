package com.company.algorithm;

import java.lang.reflect.Array;

public class allAlgorithm {
    /**
     * 冒泡排序*/
    public static int[] bubbleSort(int[] list) {
        int temp = 0;
        boolean change = false;
        for (int i = 0; i < list.length - 1; i++) {
            change = false;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    change = true;
                }
            }
            if (change == false) {
                break;
            }
        }
        return list;
    }
}
