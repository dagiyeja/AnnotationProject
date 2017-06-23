package com.sist;
import java.lang.reflect.Method;
import java.util.*;
/*
 *    *
 *    **
 *    ***
 *    ****
 *    
 *    ****
 *    ***
 *    **
 *    *
 *    
 *    for(int i=1;i<=4;i++)
 *    {
 *       for(int j=1;j<=5-i;j++)
 *       {
 *          System.out.print("*");
 *       }
 *       System.out.println()
 *    }
 *    
 *     i  j
 *    줄수   별표  
 *    1    4    i+j=5 ==>j=5-i
 *    2    3
 *    3    2
 *    4    1  
 *    
 *     System.out.print("****");
 *     System.out.print("***");
 *     System.out.print("**");
 *     System.out.print("*");
 *        
 */
class A
{
	@RequestMapping("a.do")
	public void aldjbgsh(String a)
	{
		System.out.println("a() call...");
	}
	@RequestMapping("b.do")
	public void bljkhsdfjhs(String a)
	{
		System.out.println("b() call...");
	}
	@RequestMapping("c.do")
	public void cdgsdgsg(String a)
	{
		System.out.println("c() call...");
	}
}
public class MainClass {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("입력:");//a,b,c
        String data=scan.next();
        
        /*A aa=new A();
        if(data.equals("a"))
        	aa.a();
        else if(data.equals("b"))
        	aa.b();
        else if(data.equals("c"))
        	aa.c();*/
        Class clsName=Class.forName("com.sist.A");
        Object obj=clsName.newInstance();
        Method[] methods=clsName.getDeclaredMethods();
        for(Method m:methods)
        {
        	/*String name=m.getName();
        	if(data.equals(name))
        	{
        		m.invoke(obj, null);
        	}*/
        	RequestMapping rm=
        			m.getAnnotation(RequestMapping.class);
        	if(data.equals(rm.value()))
        	{
        		m.invoke(obj, "Hello",10,10.0);
        	}
        }
	}

}




