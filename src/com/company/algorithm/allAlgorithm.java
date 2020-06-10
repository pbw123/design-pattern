package com.company.algorithm;

import java.lang.reflect.Array;

public class allAlgorithm {
    /**
     * 冒泡排序
     * 原理：比较两个相邻的元素，较大的放在右边
     * N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次
     * 算法步骤
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
         /*   for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }*/
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，
     * 存放在序列的起始位置，然后再从  剩余的未排序元素中寻找到最小（大）元素，
     * 然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            // 总共要经过 N-1 轮比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * 插入排序
     */
    public static int[] insertSort(int[] arr) {
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
//            把元素拿出来，可理解为该位置空缺
            int temp = arr[i];
//            j等于被拿出来的元素的下标
            int j = i;
            /* j>0,不然j=0时j-1得负数，被拿出来的元素temp是否比它的前一个元素小
             *第一把循环的时候，arr[j]=arr[i],arr[i]此时空缺
             * */
            while (j > 0 && temp < arr[j - 1]) {
//          arr[j]等于它的前一个元素，相当于把元素后移，在这之前arr[j]可理解成是空着的
                arr[j] = arr[j - 1];
//                j=j-1,上面元素后移后被空出来的位置下标,即arr[j]空
                j--;
            }
//            程序走到这里说明前面出现了不比被提取出来（要插入的元素）的元素大（小于/等于)
//            此时就在temp插入到空出来的位置上arr[j]
            if (j != i)//空出来的位置跟因temp=arr[i]被提取出来的位置不是一个地方,若j=i,此时arr[j]=arr[i],下面这行代码就没必要执行了
                arr[j] = temp;
        }
        return arr;
    }
}
