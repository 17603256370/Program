import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class zhuang_testTest {

    @Test
    public void init() {
        zhuang_test test1 =new zhuang_test();
        int[] arr = test1.init(7);
        int temp;
        temp = 1;
        for(int i=0; i<7; i++)
        {
            if(arr[i]<50&&arr[i]>=0)
                continue;
            else
                temp=0;
        }
        assertEquals(1,temp);
    }
}