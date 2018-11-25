package Test;

import BasSort.*;
import Utils.ArrayUtils;

/**
 * 基本排序测试类
 */
public class BaseMathticTest {

    public static void main(String[] args) {




        Integer[] array = {6,11,3,9,8};

        //冒泡排序
//        BubbleSort.bubbleSort(array);

        //插入排序
//        InsertionSort.insertionSort(array);

        //选择排序
//      ChooseSort.sort(array);

        //归并排序
//        MergeSort.sort(array);

        //快速排序
//        QuickSort.sort(array);
        //快速排序应用，找到第2个小的值
        int n = 1;
        int value = QuickSort.getMinNValue(array,n);
        System.out.printf("第"+n+"小的值为"+value);
//        ArrayUtils.printArray(array);
    }
}
