package com.company.algorithm;

import java.lang.reflect.Array;

public class allAlgorithm {
    /**
     * 冒泡排序
     * 原理：比较两个相邻的元素，较大的放在右边
     * N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次
     */
    public static int[] bubbleSort(int[] list) {
        int temp = 0;
        boolean change = false;
        for (int i = 0; i < list.length; i++) {
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

    /**
     * 选择排序
     * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，
     * 存放在序列的起始位置，然后再从  剩余的未排序元素中寻找到最小（大）元素，
     * 然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
