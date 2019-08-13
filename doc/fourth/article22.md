## 嵌套类
### 静态成员类
> 可理解成普通的类，只是写在类内部，属于外部类的静态成员，可访问外部类所有成员
可以用作外部类的辅助类。 
### 非静态成员类
> 从语法上讲与“静态成员类”区别在于没有使用 static 修饰符；
但两种也存在很大不同

类型 | 与外围类实例关系
-|-|
静态成员类   | 可脱离外围实例单独存在 |
非静态成员类 | 不可脱离，创建实例会隐含一个外围实例 |

### 匿名类
> 不存在类名，不属于外围类的成员，在使用时被声明和实例化，可以出现在代码中任何允许存在表达式的地方
- 成员变量 
```java
private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("匿名内部类");
        }
};
```
- 方法内部使用
```java
public void noNameInnerClass(){
        Runnable innerRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };
        innerRunnable.run();
}
```
- 函数对象
```java
Arrays.sort(stringArray,new Comparator<String>(){
    public int compare(String s1,String s2) {
        return s1.length() - s2.length();
    }
})
```
### 局部类
> 在任何声明“局部变量”的地方都可定义，局部类含有名字，可以反复使用
> 
```java
public void partialClassDemo() {
   class partial {

   }
   new partial();
}
```

#### 总结
    如果嵌套类在当个方法之外是可见的或者它太长了，不适合放在方法内部，就应该使用成员类；
    成员类需要一个指向外围的应用就应该声明为非静态的，否则就做成静态的；
    假设，嵌套类属于方法内部，如果只需要一个地方创建实例并且已有一个预置类型可以说明类的特征(Runnable)
    那么就要把它做成匿名类，否则就做成局部类。
