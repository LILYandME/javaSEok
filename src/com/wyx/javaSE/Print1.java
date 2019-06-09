package com.wyx.javaSE;

import java.util.Scanner;

public class Print1 {
    public static void main(String[] args) {
        System.out.println("Print!");
        System.out.println("Hello World!/n 你好");
        Scanner in = new Scanner(System.in);
        int amount = 100;
        int price = 0;
        System.out.print("请输入票面：");
        amount = in.nextInt();
        System.out.print("请输入金额：");
        price = in.nextInt();
        //括号内自动计算
        System.out.println(amount+"-"+price+"=" + (amount-price));

    }
}
