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
### 局部类