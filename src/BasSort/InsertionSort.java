package BasSort;

import Utils.ArrayUtils;

/**
 * 插入排序案例
 *
 *
 *
 */
public class InsertionSort {

    // 插入排序，a 表示数组，n 表示数组大小
    public static void insertionSort(Integer[] a) {
        if (a.length < 1) return;

        for (int i=1;i<a.length;i++){

            //记录要插入的值
            Integer value = a[i];

            //倒叙进行比较，因为左边的数据都是有序的，所以可以通过倒叙比较来向右移动
            //如果是从1开始的话，需要再加一次循环进行操作


            //记录初始比较的下表
            int j = i-1;

            //倒叙数据移动
            for (;j>=0;--j){
                if(a[j]>value){
                    //数据移动
                    a[j+1]=a[j];
                    continue;
                }else{
                    break;
                }
            }
            a[j+1]=value;
        }
        ArrayUtils.printArray(a);
    }
}
