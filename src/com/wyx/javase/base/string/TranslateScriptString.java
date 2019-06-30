package com.wyx.javase.base.string;

import java.util.Scanner;
/**
 * TranslateScript_String
 * <p/>
 *
 * @author wyx
 * @date 2019/6/30 9:32
 * Copyright (c) 2018 wisedu
 */
public class TranslateScriptString {
    public static void main(String[] args) {

        System.out.print("输入成绩:");
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        boolean flag = isDigit(score);
        if (flag) {
            //把String转成int
            int i = Integer.parseInt(score);
            boolean isv = isVisiable(i);

//			 if(isv)
//				 scoreResult(i);
//			 else
//				 System.out.println("输入的数字范围应是0~100");

           // if else 可以转换为三目表达式
            String rs = isv ? scoreResult(i) : "输入的数字范围应是0~100";
            System.out.println(rs);
        } else {
            System.out.println("应输入数字");
        }

    }
    /**
     * TranslateScript_String
     * 验证字符串是否都是数字
     * 参数 String score 为成绩
     *
     * @author wyx
     * @date 2019/6/30 9:30
     * Copyright (c) 2018 wisedu
     */
    static boolean isDigit(String score) {
        return score.matches("[0-9]{1,}");
    }
    /**
     * TranslateScript_String
     * 验证成绩的有效性
     * 参数 int i 为成绩
     *
     * @author wyx
     * @date 2019/6/30 9:29
     * Copyright (c) 2018 wisedu
     */
    static boolean isVisiable(int i) {
        if (i >= 0 && i <= 100){
            return true;
        }
        return false;
    }
    /**
     * 返回成绩相对应的评分
     * 参数 int i 为成绩
     *
     * @author wyx
     * @date 2019/6/30 9:27
     * Copyright (c) 2018 wisedu
     */
    static String scoreResult(int i) {
        int pf = i / 10;
        String rs;
        switch (pf) {
            case 10:
            case 9:
                rs = "成绩优秀";
                break;
            case 8:
                rs = "成绩良好";
                break;
            case 7:
                rs = "成绩中等";
                break;
            case 6:
                rs = "成绩及格";
                break;
            default:
                rs = "成绩不及格";
                break;
        }
        return rs;
    }
}
