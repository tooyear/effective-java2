package com.tooyear.fourth;

import org.junit.Test;

public class Artice22 {

    @Test
    public void initInnerClass() {
//      Article22.Article22InnerClass innerClass = new Article22.Article22InnerClass(); // error
        Article22.Article22InnerClass innerClass = new Article22().new Article22InnerClass();

//        初始化外部类
//        初始化非静态内部类
    }

    @Test
    public void initInnerStaticClass() {
        Article22.Article22InnerStaticClass staticClass = new Article22.Article22InnerStaticClass();
        // 初始化静态内部类
    }
}
