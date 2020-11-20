import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import static org.junit.Assert.*;

import org.junit.Test;
public class Program {
    Program(){
        System.out.println("start");
    }

    /*判断一个数组是否为空*/
    public static void empty_array(int[] array){
        if(ArrayUtils.isEmpty(array))
            throw new IllegalArgumentException("error!array is null");
        else {
            System.out.println(ArrayUtils.toString(array));
        }
    }

    /*通过生成随机数的方法初始化数组*/
    public static int[] init(int n) {
        int[] array = new int[n];
        RandomUtils r = new RandomUtils();
        if(n==0||n<0)
        {
            System.out.println("error");
        }
        else
        {
            for(int i=0;i<n;i++) {
                array[i] = r.nextInt() % 50;
            }
            /*随机生成0-49的数字存入数组，完成数组的初始化，在n输入为0时报错*/
        }
        empty_array(array);
        return array;
    }

    /*判断两个数组是否相同*/
    public static boolean  same_array(int[] array1,int [] array2) {
        int len1 = ArrayUtils.getLength(array1);
        int len2 = ArrayUtils.getLength(array2);
        int temp=1;
        if(len1!=len2)
        {
            System.out.println("array length not same");
        }
        for(int i=0;i<ArrayUtils.getLength(array1);i++)
        {
            if(array1[i]!=array2[i])
                continue;
            else
            {
                temp=0;
                break;
            }
        }
        if(temp==1)
            return true;
        else
            return false;

    }

    /*通过生成随机数的方法在数组中添加一个元素*/
    public static int[] add_array(int[] array) {
        RandomUtils r = new RandomUtils();
        int num = r.nextInt() % 50;
        array = ArrayUtils.add(array, num);
        empty_array(array);
        /*            System.out.println(array[ArrayUtils.getLength(array)-1]);*/
        return array;
    }
}

