package BasSort;

import Utils.ArrayUtils;

import java.lang.reflect.Array;

/**
 * 归并排序算法
 */
public class MergeSort {

    public static void sort(Integer[] array){

        array = merge_sort(array,0,array.length-1);
        System.out.printf("归并排序算法结果");
        ArrayUtils.printArray(array);
    }


    private static Integer[]  merge_sort(Integer[] arr,int sIndex,int eIndex){
        if(sIndex>=eIndex) return new Integer[]{arr[eIndex]};

        int middleIndex = (sIndex+eIndex)/2;

        //将数组拆分开多个数组
        Integer[] smArr = merge_sort(arr,sIndex,middleIndex);
        Integer[] meArr = merge_sort(arr,middleIndex+1,eIndex);

        //对拆分的数组进行合并
        return merge(smArr,meArr);
    }

    private static Integer[] merge(Integer[] smArr,Integer[] meArr){
        Integer[] newArr = new Integer[smArr.length+meArr.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<smArr.length && j<meArr.length){
            if(smArr[i]<meArr[j]){
                newArr[k++]=smArr[i++];
            }else{
                newArr[k++]=meArr[j++];
            }
        }


        //将剩余的内容添加到数组中
        while(i<smArr.length){
            newArr[k++]=smArr[i++];
        }

        while (j<meArr.length){
            newArr[k++]=meArr[j++];
        }

        return newArr;
    }
}
