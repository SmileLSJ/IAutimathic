package BasSort;

import Utils.ArrayUtils;

/**
 * 快速排序
 */
public class QuickSort {

    public static void sort(Integer[] array){
        quick_sort(array,0,array.length-1);
        ArrayUtils.printArray(array);
    }

    private static void quick_sort(Integer[] array,int p,int r){
        if(p>=r) return;

        int q = getPartition(array,p,r);
        quick_sort(array,p,q);
        quick_sort(array,q+1,r);
    }



    //获取分区点
    private static int getPartition(Integer[] array,int p,int r){
        //分区点
        int i = p;
        //未处理的起始下表
        int j = p;

        //分区点
        Integer partition = array[r];

        //分区比较，交换位置
        for(;j<=r-1;j++){
            if(array[j]<partition){
                swap(array,i,j);
                i++;
            }
        }
        swap(array,i,r);

        //当前面的元素都比最后一个元素小时，i向前移动一位
        if(i==r){
            i=i-1;
        }
        return i;
    }


    private static void swap(Integer[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }



    //=========================应用=============================
    //利用快速排序找出数组中第n大的数值
    public static int getMinNValue(Integer[] array,int n){
        if(n>array.length) {
            System.out.printf("查找的索引超出数组范围") ;
            return -1;
        }
        Integer[] temp = array;
        int index =  getValue(temp,0,temp.length-1,n);
        return array[index];
    }


    private static int getValue(Integer[] array,int p,int r,int n){
        int q = getPartition(array,p,r);
        if(q<n){
            return getValue(array,q+1,r,n);
        }else if(q>n){
            return getValue(array,p,q,n);
        }else{
            return q;
        }
    }
}
