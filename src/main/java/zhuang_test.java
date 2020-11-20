import org.apache.commons.lang3.RandomUtils;

public class zhuang_test extends Program{
    zhuang_test(){
        System.out.println("zhuang_test start");
    }
    /*进行重构*/
    /*判断一个数组是否为空*/
    public static void empty_array(int[] array){
        System.out.println("zhuang_test finish");
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
}