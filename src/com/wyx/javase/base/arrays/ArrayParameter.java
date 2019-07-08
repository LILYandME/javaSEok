package com.wyx.javase.base.arrays;

import java.util.Arrays;
/**
 * ArrayParameter 
 * <p/>
 * 数组当参数时,要注意,改变形参时会改变实参;
 * 
 * @author wyx
 * @date 2019/7/8 20:30  
 * Copyright (c) 2018 wisedu
 */ 
public class ArrayParameter {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        testArrayParameter(test);
        System.out.println("main:"+test.toString()+Arrays.toString(test));
    }
    static void  testArrayParameter(int look[]){
        System.out.println("look-start"+look.toString()+ Arrays.toString(look));
        look[0] = 100;
        System.out.println("look-whetherChange:"+look.toString()+Arrays.toString(look));
    }

}
