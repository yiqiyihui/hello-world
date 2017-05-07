package com.juvenxu.mvnbook.hello_world;

/**
 * Hello world!
 *
 */
public class App 
{  
	
	public String triangle(float a,float b,float c)//返回值类型为字符串
	{ 
    	if(a<=0||b<=0||c<=0)
        return"三角形的边长不能为小于等于0的数";
    	if(a+b>c&&a+c>b&&b+c>a)
    		if(a==b||a==c||b==c)
    			return"这是个等腰三角形";
    	      if(a==b&&b==c)
    	    	  return"这是个等边三角形";
    	   return"这是个普通三角形";

    		
    }
}
