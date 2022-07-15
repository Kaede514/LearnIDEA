package com.kaede.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author kaede
 * @create 2022-06-03 14:13
 *
 * IDEA中代码模板所在的位置：settings -> Editor -> Live Templates
 * settings -> Editor -> General -> Postfix Completions
 *
 * 常用的模板
 */

public class TemplatesTest {
    //模板1：main
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / xx.sout
        System.out.println("args = " + Arrays.deepToString(args));  //打印形参 soutp
        System.out.println("TemplatesTest.main");   //打印方法名 soutm
        int num = 10;
        String name = "k";
        System.out.println("num = " + num);     //打印变量
        System.out.println(name);       //name.sout
        System.out.println("name = " + name);   //name.soutv

        //模板三（适用于数组和集合）：fori
        String[] arr = {"Tom", "Jerry", "Lucy"};
        //fori Tab，给变量起名然后回车，确定循环次数然后回车，写循环体
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：arr.fori  arr.iter
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：倒序遍历 arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        //遍历数组里每个元素的话就用xx.fori xx.iter，其他用fori iter
        new TemplatesTest().method();
    }

    public void method() {
        //模板5：ifn
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tom");
        strings.add("Jerry");
        strings.add("Lucy");
        if (strings == null) {

        }
        //变形：inn
        if (strings != null) {

        }
        //变形：xx.null xx.nn
        if (strings == null) {

        }
        if (strings != null) {

        }
    }

    @Override
    public String toString() {
        return "TemplatesTest{}";
    }

    //模板6：psf psfi psfs prsf
    public static final Integer I = 0;
    public static final int J = 0;
    public static final String K = "";
    private static final String M = "";

    /**
     * 自定义模板
     * settings -> Editor -> Live Templates
     * 添加模板组命名为 MyTemplates，添加实时模板
     * 缩写：test          描述：生成测试方法
     * 模板文本：
     * public void test$VAR$() {
     * $END$;
     * }
     * 定义：勾选Java
     * <p>
     * 之后就可以直接使用自定义的模板
     */

    public void testPrint() {
        System.out.println("test");
    }
}
