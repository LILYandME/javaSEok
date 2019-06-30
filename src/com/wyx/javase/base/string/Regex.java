package com.wyx.javase.base.string;

import java.util.regex.*;

/**
 * Regex
 * 正则表达式
 * '.（点号）也是一个正则表达式，它匹配任何一个字符如："a" 或 "1"。'
 * 解析地址 https://www.cnblogs.com/Mustr/p/6060242.html
 *
 * @author wyx
 * @date 2019/6/30 9:44
 * Copyright (c) 2018 wisedu
 */
public class Regex {
    /**
     * Regex
     * java.util.regex 包主要包括以下三个类：
     * <p>
     * Pattern 类：
     * pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，
     * 你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
     * <p>
     * Matcher 类：
     * Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。
     * 你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
     * <p>
     * PatternSyntaxException：
     * PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
     *
     * @author wyx
     * @date 2019/6/30 10:04
     * Copyright (c) 2018 wisedu
     */
    public static void main(String[] args) {
        testMatches();
        testMatcher();
        splitDemo();
    }

    /**
     * Regex
     * 捕获组
     * 捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
     * <p>
     * 例如，正则表达式 (dog) 创建了单一分组，组里包含"d"，"o"，和"g"。
     * <p>
     * 捕获组是通过从左至右计算其开括号来编号。例如，在表达式（（A）（B（C））），有四个这样的组：
     * <p>
     * ((A)(B(C)))
     * (A)
     * (B(C))
     * (C)
     * 可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
     * <p>
     * 还有一个特殊的组（group(0)），它总是代表整个表达式。该组不包括在 groupCount 的返回值中。
     *
     * @author wyx
     * @date 2019/6/30 10:12
     * Copyright (c) 2018 wisedu
     */
    static void testMatches() {
        String content = "I am noob " +
                "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }

    static void testMatcher() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
    /**
     * Regex
     * <p/>
     * 运行结果 : "er，ty，ui，o"
     * @author wyx
     * @date 2019/6/30 10:23
     * Copyright (c) 2018 wisedu
     */
    static void splitDemo()
    {
        String str = "erkktyqqquizzzzzo";
        String reg ="(.)\\1+";
        //按照叠词来进行切割
        //可以将规则封装成一个组。用()完成。组的出现都有编号。
        //从1开始。 想要使用已有的组可以通过  \n(n就是组的编号)的形式来获取。
        String[] arr = str.split(reg);
        System.out.println(arr.length);
        for(String s : arr)
        {
            System.out.println(s);
        }
    }
//next javase04
}
