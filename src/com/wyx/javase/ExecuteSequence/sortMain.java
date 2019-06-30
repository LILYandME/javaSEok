package com.wyx.javase.ExecuteSequence;

class Parent {
    //静态成员变量
    public static int t = parentStaticMethod2();
    //代码块
    {
        System.out.println("父类非静态初始化块");
    }
    static
    {
        System.out.println("父类静态初始化块");
    }
    //构造方法
    public Parent()
    {
        System.out.println("父类的构造方法");
    }
    //父类静态方法
    public static int parentStaticMethod()
    {
        System.out.println("父类的静态方法");
        return 10;
    }
    public static int parentStaticMethod2()
    {
        System.out.println("父类的静态方法2");
        return 9;
    }

    @Override
    protected void finalize() throws Throwable
    {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("销毁父类");
    }
}

class Child extends Parent{
    //代码块
    {
        System.out.println("子类非静态初始化块");
    }
    static
    {
        System.out.println("子类静态初始化块");
    }
    //构造方法
    public Child()
    {
        System.out.println("子类的构造方法");
    }
    //静态方法
    public static int childStaticMethod()
    {
        System.out.println("子类的静态方法");
        return 1000;
    }

    @Override
    protected void finalize() throws Throwable
    {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("销毁子类");
    }
}


public class sortMain {
    //https://blog.csdn.net/hellorichen/article/details/53007716
    public static void main(String[] args){
	/**	1. 虚拟机在首次加载Java类时，会对静态代码块、
	 *   静态成员变量、静态方法进行一次初始化（静态间按顺序执行）。
		2. 只有在调用new方法时才会创建类的实例。
		3. 类实例创建过程：父子继承关系，先父类再子类。
        父类的静态->子类的静态->父类的初始化块->父类的构造方法
         ->子类的初始化块->子类的构造方法
		4. 类实例销毁时候：首先销毁子类部分，再销毁父类部分。*/

        // Parent.parentStaticMethod();
        System.out.println("===============================");

        //注意第二次的调用
        //Parent.parentStaticMethod();
        System.out.println("###########################");
        Parent p1 = new Parent();
        System.out.println("---------------------------------------");
        Parent p2 = new Parent();

		Child c = new Child();
		try {
//		    finalize()是Object的protected方法，子类可以覆盖该方法以实现资源清理工作，GC在回收对象之前调用该方法。
			c.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
    }
}
