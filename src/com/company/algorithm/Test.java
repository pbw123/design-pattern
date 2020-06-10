package com.company.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test() {
       int[] arrays= new int[]{10,7, 1, 9, 2, 8, 5,3,6,4,0};
//       用自带方法排序
        Arrays.sort(arrays);
//        用自带方法遍历
        String s = Arrays.toString(arrays);
        System.out.println(s);

        int[] lists = allAlgorithm.bubbleSort(arrays);
        System.out.print("冒泡排序：");
        for (Integer list : lists) {
                System.out.print(list + "-");
        }
    }

    @org.junit.Test
    public void selectSortTest() {
        int[] arr = new int[]{5, 1, 9, 7, 10};
        int[] ints = allAlgorithm.selectionSort(arr);
        System.out.print("选择排序：");
        for (int i : ints) {
            System.out.print(i+"_");
        }
    }

    @org.junit.Test
    public void insertSortTest() {
        int[] arr = new int[]{5, 1, 9, 7, 10,8};
        int[] ints = allAlgorithm.insertSort(arr);
        System.out.print("插入排序：");
        for (int i : ints) {
            System.out.print(i+"—");
        }
    }
}
