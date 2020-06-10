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
        System.out.print("从小到大排序：");
        for (Integer list : lists) {
                System.out.print(list + "-");
        }
    }
}
