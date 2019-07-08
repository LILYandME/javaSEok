package com.wyx.javase.somethinginteresting;

/**
 * HeartShaped
 * <p/>绘制一个心形图案
 *
 * @author wyx
 * @date 2019/7/1 23:11
 * Copyright (c) 2018 wisedu
 */
public class HeartShaped {
    public static void main(String[] args) {
        System.out.printf("\n\n\t送我一颗小心心：");
        float y, x, z, f;
        for (y = 1.5f; y > -1.5f; y -= 0.1f) {
            for (x = -1.5f; x < 1.5f; x += 0.05f) {
                z = x * x + y * y - 1;
                f = z * z * z - x * x * y * y * y;
                System.out.print(f <= 0.0f ? "o8-=+*#%@".charAt((int) (f * -8.0f)) : ' ');
            }
            System.out.println();
        }

    }
}
