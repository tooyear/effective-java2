package com.tooyear.fourth;

/**
 * 第22条 优先考虑静态成员类
 *  四种嵌套类
 *
 */
public class Article22 {

    public Article22() {
        System.out.println("初始化外部类");
    }

    public class Article22InnerClass {
        public Article22InnerClass() {
            System.out.println("初始化非静态内部类");
        }
    }

    public static class Article22InnerStaticClass {
        public Article22InnerStaticClass() {
            System.out.println("初始化静态内部类");
        }
    }

}
