package com.wyx.javase.somethinginteresting;

/**
 * aSquarePlusbSquareEqualcSquare
 * <p/>
 * java编程 a^2+b^2=c^2 满足条件得数有多少
 * 简化 (a^2)/(b+c)=c-b 加减容易口算
 *
 * @author wyx
 * @date 2019/6/30 14:17
 * Copyright (c) 2018 wisedu
 */
public class SolveASquarePlusBSquareEqualCSquare {
    /**
     * SolveASquarePlusBSquareEqualCSquare
     * <p/>
     * (a^2)/(b+c)=c-b 加减容易口算 满足120以内的条件的数有多少
     *
     * @author wyx
     * @date 2019/6/30 14:26
     * Copyright (c) 2018 wisedu
     */
    static void testMine() {
        int a, b, c;
        int cnt = 0;
        for (a = 3; a < 120; a++) {
            for (b = a + 1; b < 120; b++) {
                for (c = b; c < 120; c++) {
                    if ((c - b) == ((float) (a * a) / (c + b) == 0 ? -1 : (float) (a * a) / (c + b))) {
//                        此处主要是 / 是取整的除法, 以后使用要注意
//                    if ((c - b) == ((float)(a * a) / (c + b) == 0 ? -1 : (float)(a * a) / (c + b))&&(a+b)<2*c) {
                        cnt++;
                        System.out.printf("(%d-%d) = (%d*%d) / (%d+%d)\n", c, b, a, a, c, b);
                    }
                }
            }
        }
        System.out.println("总共total:" + cnt);
    }

    /**
     * SolveASquarePlusBSquareEqualCSquare
     * <p/>
     * a^2+b^2=c^2 满足120以内的条件的数有多少
     *
     * @author wyx
     * @date 2019/6/30 14:25
     * Copyright (c) 2018 wisedu
     */
    static void testHundred() {
        int a, b, c;
        for (a = 1; a < 120; a++) {
            for (b = a; b < 120; b++) {
                for (c = b; c < 120; c++) {
                    if (c * c == a * a + b * b) {
                        System.out.printf("%d*%d + %d*%d = %d*%d\n", a, a, b, b, c, c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        testHundred();
        testMine();
    }
}
