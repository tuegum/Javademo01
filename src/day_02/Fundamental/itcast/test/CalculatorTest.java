package day_02.Fundamental.itcast.test;

import day_02.Fundamental.itcast.unit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    /*
    * 用于资源的申请，所有方法都在此方法之后执行
    * */
    public void init(){
        System.out.println("innit...");
    }

    /*
    * 用于资源的释放，所有方法都在此方法之前执行
    * */
    @After
    public void close(){
        System.out.println("close...");
    }


    @Test
    public void TestAdd(){
        System.out.println("已执行！");
        Calculator ct = new Calculator();
//        System.out.println(ct.Add(1, 3));
        int res = ct.Add(1,2);
        //断言操作处理结果
        Assert.assertEquals(3,res);
    }
}
