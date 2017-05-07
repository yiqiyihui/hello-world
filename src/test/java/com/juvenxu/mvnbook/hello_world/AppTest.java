package com.juvenxu.mvnbook.hello_world;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
         App app = new App();//App实例化一个对象
        float d=5.1f;//定义单精度float类型时，赋值的后加f,否则会报错
        float e=6.4f;
        float f=7.9f;
        
        String result=app.triangle(d,e,f);//实例化的对象调用被测程序的方法
        assertEquals("这是个普通三角形", result);//用于判断实际值和期望值是否相同
        //assertTrue( true );
    }
}
