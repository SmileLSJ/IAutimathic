package BasSort;

import Utils.ArrayUtils;

/**
 * 选择排序
 */
public class ChooseSort {

    public static void sort(Integer[] array){
        int len = array.length;
        if(len<=1) return;

        for(int i =0;i<=len-1;i++){

            //最小的值
            int minValue = array[i];
            int minIndex = i;

            //查找出未排序中的最小的值以及索引
            for(int j=i+1;j<len;j++){
                if(array[j]<minValue){
                    minValue=array[j];
                    minIndex=j;
                }
            }

            //更换数据
            int temp = array[i];
            array[i]=minValue;
            array[minIndex]=temp;
        }
    }
}
