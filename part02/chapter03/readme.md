## 3、类和对象 
----
### 3.1、类 
----
#### 3.1.1、定义类 
----
#### 3.1.2、定义成员变量 
##### 3.1.2.1、访问修饰符、变量类型、变量命名。在类中的变量，称为成员变量 
##### 3.1.2.2、在方法或者代码块中的变量，称为局部变量 
##### 3.1.2.3、在方法（括号）中的变量，称为参数 
##### 3.1.2.4、成员变量的定义，由以下3个部分组成：修饰符，如：public、private，要或者不要都可以；成员变量的类型；成员变量的名称 
##### 3.1.2.5、在“封装”的思想中，通常用private来修饰成员变量 
----
#### 3.1.3、定义方法：方法命名、方法重载 
----
#### 3.1.4、为类提供构造器 
##### 3.1.4.1、就算bicycle只有1个构造器，它也可以有其它的构造器，包括没有参数的构造器 
##### 3.1.4.2、不同的构造器都可以在类中存在，因为它们有着不同的参数列表 
##### 3.1.4.3、如果编写同名且参数相同的构造器，那么会产生编译时错误 
----
#### 3.1.5、给方法或构造器传递信息 
##### 3.1.5.1、参数类型：注意，形参是定义方法时的参数，实参时调用方法时的参数。当调用方法时，参数的类型和顺序必须和定义方法时的类型和顺序匹配。基本数据类型和引用数据类型，都可以作为方法的参数。注意：如果想要给方法传递方法，使用lambda表达式或者方法引用 
##### 3.1.5.2、任意数量的参数：当不明确需要传递多少数量的特定类型的参数给方法时，用一种称作“可变参数”的结构，给方法传递传递任意数量的参数：(类型... 参数名) 
##### 3.1.5.3、参数名称 
##### 3.1.5.4、传递基础类型的参数 
##### 3.1.5.5、传递引用类型的参数 