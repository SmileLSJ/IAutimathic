package Utils;

/**
 * 数组工具类
 */
public class ArrayUtils {

    //打印出数组的内容
    public static<T> void printArray(T[] array){
        String str = "";

        str+="[";
        for (int i =0 ;i<array.length;i++){
            str+=array[i];
            if(i==array.length-1){
                continue;
            }

            str+=",";
        }
        str+="]";

        System.out.println(str);
    }
}
