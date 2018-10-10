# Java基础语法     
09_28~      
## Day01

### Java特征

面向互联网编程、web应用开发首选语言、安全可靠、简单易学、面向对象、跨平台等

### Java三大技术架构

J2se（基础版/标准版）主要是针对小型应用程序或者桌面服务提供的解决方案
J2ee（企业版/商务版）主要是针对企业模块化开发或者集中开发所提供的解决方案
J2me（小型版）主要是针对移动终端上的嵌入式开发提供了可能
Jdk1.5版本---java里程碑式的阶段---JAVASE、JAVAEE、JAVAME
### 搭建Java语言环境
JRE（java Runtime Environment，java运行时环境）代表的是java程序运行需要的最基本的运行环境
JRE=JVM+核心类库
JDK（java Development Kit java开发工具包）代表的是Java程序开发需要的工具
JDK=JRE+开发工具

### 环境变量
+ **JAVA_HOME** JDK安装路径
+ **PATH** %JAVA_HOME%\bin 

### Dos常用操作
+ **dir** 展示当前目录文件
+ **cd** 进入指定目录
+ **cd..** 返回上一级
+ **cd/** 返回根目录

### javac java
.java文件---存储的是程序员可以看得懂的信息（源文件）
.class文件---存储的是二进制信息（字节码文件）

.java文件---通过javac命令---编译---.class文件
.class文件---通过java命令---运行---得到最终结果

<font color="#FF4500">Tips：</font>      
1. 声明公共类后.java文件名必须与类名相同        
2. 一个.java文件可以有多个类，但只能有一个公共类，可以有多个普通类     
3. 多个类名相同只有大小写区分，只生效最后一个.class文件     
### package带包编译
```
package cn.tedu.com;
public class Demo{
    	public static void main(String[] args){
    		System.out.println("java");
    	}
}
```
+ 编译：javac -d . Demo.java   （.代表当前目录）
+ 执行：java cn.tedu.com.Demo
### 标识符
组成：

1. 字母（各国常见字符）
2. 数字（0-9） 
3. 特殊字符（$(一般不建议使用)、_）

命名规则：

1. 不能是关键字  
2. 不能以数字开头

驼峰命名法---命名规范：

1. 接口名或者类名如果是多个单词组成 （XxxYyyZzz）
2. 方法名或者变量名如果是多个单词组成 （xxxYyyZzz）
3. 包名：单级目录如果是多个单词（xxxyyyzzz），多级目录（xxx.yyy.zzz）
4. 常量名：如果是多个单词（XXX_YYY_ZZZ）

## Day02
### 注释
+ 单行注释（//注释内容）单行注释可以嵌套单行注释
+ 多行注释（/** 注释内容**/）多行注释可以嵌套单行但不可嵌套多行
+ 文档注释（/**注释内容*/）通过javadoc命令对.java文件里的文档注释进行提取生成程序说明书
### 常量   
运算过程中不发生改变的量   
  
+ 字面值常量
   
	整数常量：88、66    
	小数常量：2.3、6.8    
	字符串："hello"    
	字符串常量：'a'    
	空常量：null    
	布尔常量：ture false    
+ 自定义常量    

### 整数的四种表现形式
+ 二进制（由0、1组成，0b开头）
+ 八进制（由0~7组成，0开头）
+ 十进制（由0~9组成）
+ 十六进制（由0~9，a~f组成，0x开头）
### 进制转化    
系数：每位上的数    
基数：X进制为X    
权：对每位数从右往左由0开始编号    

+ 任意进制转换为十进制    
规律：系数乘以基数的权次幂之和    

+ 十进制转换为任意进制    
规律：除基取余，直到商为0，余数反写    

+ 任意转换    
所有数据都是根据计算机底层硬件状态决定的
1. 根据规律先转成十进制   
2. 拆分组合 
    + （八进制）从右往左每三位一组，不够补0，算出每组十进制，对应八进制拼合
    + （十六进制）从右往左每四位一组，不够补0，算出每组十进制，对应十六进制拼合

大部分十进制小数转二进制是无限位数的   

### 有符号的数
所有数据在底层都是二进制数据的 **补码** 形式存储的    

| 原码    | 符号位   |  数值位      |           
| :----:  | :----:   | :----:       |
| 5       |   0      |   000 0101   |
| -5      |   1      |   000 0101   |

| 反码    | 符号位   |  数值位      |           
| :----:  | :----:   | :----:       |
| 5       |   0      |   000 0101   |
| -5      |   1      |  <font color= "#FF4500"> 111 1010 </font>   |

| 补码    | 符号位   |  数值位      |           
| :----:  | :----:   | :----:       |
| 5       |   0      |   000 0101   |
| -5      |   1      |   <font color= "#FF4500"> 111 1011 </font>   |

 
正负数的原反补符号位都不变    
正数的原反补数值位都一样    
负数的反码为原码取反，原码取反加1得补码，补码取反加1得原码

### 变量
在程序中发生改变的量称为变量（储存数据的容器）   
java是强类型语言，每个数据都要有对应的数据类型
     
**java有两种数据类型：**
 
**基本数据类型（四类八种）**

| 整型    | 字节   |  范围      |           
| :----:  | :----:   | :----:       |
| byte       |   1      |   -128~127   |
| short      |   2      |   -32768~32767   |
| int    | 4   |  -21 4748 3648~21 4748 3647      |           
| long | 8   | -2<sup>63</sup>~2<sup>63</sup>-1       |
| **浮点型**       |   **字节**      |    **范围**   |
|float      |   4      |   -2<sup>38</sup>~2<sup>38</sup>   |
| double    | 8   |  -2<sup>308</sup>~2<sup>308</sup>      |  
| **布尔型**  | **字节**  | **范围**      |
| boolean       |   1      |   true false   |
| **字符型**      |   **字节**      |   **范围**   |
| char    | 2   |  0~65535      |        
为了编程开发的方便，Java引入了基本数据类型，但是为了能够将这些基本数据类型当成对象操作，Java为每一个基本数据类型都引入了对应的包装类型（wrapper class），从Java5开始引入了自动装箱和自动拆箱，使得二者可以相互转换。
（Byte、Short、Integer、Long、Float、Double、Boolean、Character）  
``` 
class IntegerCache{
    public static void main(String[] args){
    	Integer a = 127;
    	Integer b = 127;
    	Integer a1 = 200;
    	Integer b1 = 200;
    	System.out.println(a == b); //true
    	System.out.println(a1 == b1); //false
    	//Integer默认缓值范围-128~127
	}
}
```      
**引用数据类型（数组和接口）**   

### 编码   
把文字编码为数字     
  
ASCII  0~127    
ISO-8859-1（西欧码表）  0~255（1字节）    
GB2312（简体中文）  
BIG5（繁体中文） 0~65535（2字节）  
GBK（国标码）  0~65535（2字节）    
Unicode编码体系（utf-8 3字节、utf-16 2字节、utf-32、utf-e32）     

所有码表默认兼容西欧码表
### 数据类型之间的操作
+ 类型提升

1. 隐式转换（从小到大）>>>（byte --> short --X-- char） ---> int --> long --（可能产生误差）--> float --> double
2. byte、short、char参与运算自动提升为int类型
3. char只能自传或者传给更大类型

单引号里的内容是字符，双引号的内容是字符串

+ int a='a' 正确  int a="a" 错误

## Day03
### 运算符    
运算符优先级： (  ) ~ ++ -- ! * / % + - << >> >>> 关系 逻辑 & | ^ 三元 赋值    
#### 1. 算术运算符     
（+ - * / % ++ --）    

+ +可以用作运算，整数和字符拼接，字符会强制转换成int，遇到常量字符串会拼接成新的字符串   
+ / 整数参与运算结果整数，只要有小数参与运算结果必为小数    
    
	**异常**
	1. 整数除0（java.lang.ArithmeticException:/by zero）算数异常
	2. 小数除0（Infinity）正无穷大  负数除0（-Infinity）负无穷大
	3. 0/0.0 0.0/0 0.0/0.0 （NaN）     
		
+ % 取余结果符号跟左边    
+ （j = i++） 先把i值赋给j，然后i自增1；（j = ++i） i先自增1；然后赋值给j     

#### 2. 赋值运算符   
（= += -= *= /= %=）&=（按位与等） |=（按位或等） ^=（按位异或等） <<=（左移等） >>=（右移等） >>>=（无符号右移等）     

+ java不支持连等定义（a=b=c=1 错误）     
+ java支持连等赋值
```
class LianDeng｛
    pulic static void main(String[] args{
    int a = 4;
    int b = a+=a-=a*=a++;
    //b = 4+=4-=4*=4;4*4=16;4-16=-12;4+(-12)=-8
    System.out.println(b);//-8
    int b = a+=a-=a*=++a;
    //b = 4+=4-=4*=5;4*5=20;4-20=-16;4+(-16)=-12
    System.out.println(b);//-12
    }
｝
```

  
#### 3. 比较运算符      
（== != < > <= >=）

+ 结果一定是布尔型
#### 4. 逻辑运算符     
（&逻辑与）（| 逻辑或）（^逻辑异或）（！逻辑非）（&&双与）（| |双或）    

用于连接布尔表达式或者值的符号    
表达式：连接变量或者数据且符合java表达式的式子    
	
**结论**    

&：遇false则false    
|：遇true则true    
^：相同则true不同则false     
！：取反，如果操作次数是偶数则结果还是本身    
&&：与&运算规律一致，如果左边的值为false，则右边默认不执行（短路效果）     
| |：与 | 运算规律一致，如果左边的值为true，则右边默认不执行（短路效果）      
&&、| |： | | 在&&前面，如果 | | 短路就会把&&短路掉
#### 5. 位运算符     
（&按位与）（| 按位或）（^按位异或）（~按位取反）（>>右移）（<<左移）（>>>无符号右移）     

源码：要把数据转成二进制数据的补码形式     

```
class WeiYunSuan{
	public static void main(String[] args){
		int a=4;
		int b=5;
		System.out.println(a&b);//4
		System.out.println(a|b);//5
		System.out.println(a^b);//1
		System.out.println(~a);//-5
	}
}
```   
**00000000 00000000 00000000 00000100 int 4(补码)    
00000000 00000000 00000000 00000101 int 5(补码)**

&（按位与）遇0则0    

任意一个数&偶数结果一定是偶数    
任意一个数&正数结果一定是正数         
任意一个数&1==0-->这个任意数是一个偶数      

00000000 00000000 00000000 00000100                
00000000 00000000 00000000 00000101     

00000000 00000000 00000000 00000100  **4**     

| （按位或）遇1则1     

任意一个数 | 奇数结果一定是奇数    
任意一个数&负数结果一定是负数      

00000000 00000000 00000000 00000100      
00000000 00000000 00000000 00000101      
	
00000000 00000000 00000000 00000101   **5**


^(按位异或)相同则0，不同则1     

00000000 00000000 00000000 00000100     
00000000 00000000 00000000 00000101      

00000000 00000000 00000000 00000001   **1**     

（扩展：一个数异或另一个数两次，结果还是这个数；a^b^b结果还是a）    

**拓展：交换两个a、b整数位置**    

+ 中间变量（开发中常用、效率最低）`int temp = a ; a = b ; b = temp ; `    
+ 求和（一般是整数、效率中）`a = a + b ; b = a - b ; a = a - b ; `   
+ 按位异或（针对整数、效率最高）`a = a ^ b ; b = a ^ b ; a = a ^ b ; `    

~（按位取反）1变00变1      
 
00000000 00000000 00000000 00000100 （a的补码）     
11111111 11111111 11111111 11111011 （~a的补码）

注意因为按位取反变成了负数，求显示值，要补码取反加1

10000000 00000000 00000000 00000100 （~a的反码）      
10000000 00000000 00000000 00000101 （~a的原码，即显示值）**-5**    

+ > > 、< < 、> > >      
```
class WeiYunSuan{
	public static void main(String[] args){
		int a=5;
		System.out.println(a>>2);//1
		System.out.println(a<<2);//20
		System.out.println(a>>>2);//1
		int b=-5;
		System.out.println(b>>2);//-2
		System.out.println(b<<2);//-20
		System.out.println(b>>>2);//1073741822
	}
}
```
1. 右移：如果是正数右移，最左边补零，如果是负数右移，最左边补1（如果是正数，结果为a/2<sup>2</sup>（移动的位数））      
2. 左移：整体（不管正负数）往左移，最右边补零（结果为a*2<sup>2</sup>（移动的位数））      
3. 无符号右移：无论是正数还是负数右移，左边都是补零（最终得到的一定是正数）  


#### 6. 三目（元）运算符    

表达式？表达式值1：表达式值2；    
如果表达式的值是true，那么就执行表达式1得到值1，如果是false，那么就执行表达式2得到值2    

三数求最大，三目嵌套：` System.out.println(x>y?(x>z?x:z):(y>z?y:z)); `   
### 键盘录入   
从控制台获取数据    

1. 导包` import java.util.Scanner ; `    
2. 找到Scanner ` Scanner sc = new Scanner(System.in) ; `   
3. 获取数据 `int num = sc.nextInt() ; `   

## Day04   

### 流程控制语句   
+ **顺序结构**     

	从上到下，从左到右     

+ **选择结构**
	1. if 语句    
	
	    ```  
	    if （判断条件）｛   
            语句;    //如果只有一条语句，可以不加大括号     
        ｝   
             
        if （判断条件1）｛   
            语句1;    
        ｝ else ｛    
            语句2;   
        ｝   
           
        if （判断条件1）｛   
            语句1;    
        ｝ else if （判断条件2） ｛    
            语句2;    
        ｝ else if （判断条件3） ｛     
            语句3;    
        ｝ else if （判断条件n）｛     
            语句n;    
        ｝ else ｛    
            语句n+1;     
            ｝    
    ```
    2. switch 语句
    
    	``` 
    	switch （表达式）{   
			case 值1:    
			语句1;    
			break;    
			case 值2:     
			语句2;     
			break;    
			……    
			default:     
			语句n;    
    	}    
    	```     
	case只是常量值，且不能重复      
	default最后执行，可以省略      
	break省略导致case穿透      
	switch语句结束的标志：遇到break或者执行到代码最后一行      
	 
+ **循环结构**
	1. for循环 
	
		```    
		for （初始值；判断条件；控制条件）{    
			循环体；    
		}    
		```   
	    执行流程：先拿到初始值，跟判断条件进行比较，如果是true就执行循环体，再执行控制条件，跟判断条件比较如果是true就重复执行上述操作直到为false就结束循环
	2. while循环    
	```   
	while （判断条件）{     
		循环体；     
	}     
	```
	    执行流程：同for    
	    一般首选for循环，如果范围不明确，则优先选择while   
	
	3. do……while循环   
	```
	do{
		循环体；
	}while（判断条件）；   
	
	```
	    执行流程：先拿到初始值，执行循环体，在执行控制条件，再执行判断条件，值为true则重复执行直到false

+ **跳转控制语句**     
break：用在switch（结束switch语句），用在循环（结束当前循环）   
continue：用在循环（跳过当次循环）   
return：    
### 数组     
存储多个相同数据类型的容器   
#### 格式       
1. 数据类型[  ]  数组名 = new 数据类型[大小]；      
		eg：`int[] arr = new int[5];`     
2. 数据类型[  ]  数组名 = new 数据类型[ ]{元素1，元素2，……元素n}；    
		eg：`int[] arr = new int[]{1,2,3,4,5};`     
3. 数据类型[  ]  数组名 = {元素1，元素2，……元素n}；   
		eg：`int[] arr = {1,2,3,4,5};`    
		
**拓展**（打印数组名的返回值）：    
|   [   |    I   |    @   |   659e0bfd   |
|   :----:    |    :----:     |   :----:     |   :----:    |
|代表的是对象的类型（[ 是数组）  |  代表对象里元素的数据类型（I 是int） | 标记符号，表示后面是一个地址    |  对象的哈希码的十六进制形式   |     
**异常**    
java.lang.ArrayIndexOutOfBoundsException（数组下标越界）
####java内存    
1. 栈    
存储的是变量，不会对存储的内容进行赋初始值，使用完成后立即清除
2. 堆      
存储的是对象，会自动对存储的内容进行赋初始值（初始值如下），使用完成后会在某个时刻清除    
| byte、short、int  |    char   |    long   |   float  |   double  |  boolean|  其他  |
|   :----:    |    :----:     |   :----:     |   :----:    | :----:    | :----:    | :----:    |
| 0  | \u0000|  0L | 0.0f   | 0.0   |   false  |   null   |

3. 方法区   
4. 本地方法栈   
5. 寄存器    
## Day05  
#### 数组的应用   

##### 遍历
依次把数组元素输出  

+ 普通for循环      
	
`for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}`      
	
+ 迭代器（增强for循环）只能遍历不能修改，只是把堆内存的元素值拷贝   
	  
`for(int i:arr){System.out.println(i);}` 

+ 转成字符串输出     

`import Arrays;`

`System.out.println(Arrays.toString(arr));`      
##### 最值 

```   
import java.util.Arrays;
public class ArrayMax {
	public static void main(String[] args) {
		int[] arr={5,9,15,16,28,37,45,48,56,59};
		System.out.print(Arrays.toString(arr));
		//以数组第一位为参照物
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}System.out.println("\n"+"最大值为："+max);
	}
}
```   
##### 逆序     
+ 定义新数组	   
```   
import java.util.Arrays;
class ArrayReverse{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6};
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			//把arr的最后一位赋值给arr1第一位
			arr1[i]=arr[arr.length-1-i];
		}
		arr=arr1;
		System.out.println(Arrays.toString(arr));
	}
}
```
+ 两整数互换
```
import java.util.Arrays;
class ArrayReverse{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6};
		int[] arr1=new int[arr.length];
		for(int i=0;i<=(arr.length-1)/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}   
```  
##### 查找
根据给出的查找值返回对应的数组下标   

+ for循环（任意数组）      
```   
class ArraySearch{
	public static void main(String[] args){
		int[] arr={1,4,5,6,8};
		int num=6;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.println(i);
			}
		}
	}
}
```
+ 增强for循环
```   
class ArraySearch{
    public static void main(String[] args){
		int[] arr={1,4,5,6,8};
		int num=6;
		int count=0;
		for(int i:arr){
			if(i==num){
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}
```   
+ 二分查找法（针对有序数组）      
```    
import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch {
	public static void main(String[] args) {
		int[] arr={5,9,15,16,28,37,45,48,56,59};
		System.out.print(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"输入查找的数据：");
		int num=sc.nextInt();
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		boolean flag=true;
		while(num!=arr[mid]){
			if(num<arr[mid])
				max=mid-1;
			if(num>arr[mid])
				min=mid+1;
			if(min>max){
				flag=false;
				System.out.println("查无此数");
				break;
			}
			mid=(min+max)/2;
		}
		if(flag)
		System.out.println(mid);
	}
}
```   
##### 排序     
+ 冒泡     
```    
import java.util.Arrays;     
public class MaoPao {     
	public static void main(String[] args) {     
		int[] arr={1,2,5,4,9,6,7};     
		for(int i=1;i<=arr.length-1;i++){     
			for(int j=1;j<=arr.length-i;j++){     
				if(arr[j-1]>arr[j]){     
					int temp=arr[j];      
					arr[j]=arr[j-1];     
					arr[j-1]=temp;     
				}   
			}    
		}     
		System.out.println(Arrays.toString(arr));     
	}     
}       
```    
+ 选择     
```   
import java.util.Arrays;
public class ArrayChoose{
	public static void main(String[] args){
		int[] arr={1,5,2,4,7};
		for(int i=1;i<arr.length;i++){
			for(int j=i-1;j<arr.length;j++){
				if(arr[i-1]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i-1];
					arr[i-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
```
+ 哈希    
+ 堆    
	
`Arrays.sort(arr);` 

**代码执行效率：**     
| — —  | 时间复杂度   | 空间复杂度      |           
| :----:  | :----:   | :----:       |
| 二分查找       |   （1/2）<sup>x</sup>=n--->O（log<sub>2</sub>n）    |   O（1）  |
| 冒泡、选择       |   n（n-1）--->n<sup>2</sup>-n--->O（n<sup>2</sup>）     |   O（1）   |
| Arrays.sort( )      |   O（nlogn）     |    — —   |
	
	     
##### 扩容
实际是数组的复制（数组定义完成之后长度不变）

+ 生成新数组    
```  
import java.util.Arrays;
public class KuoRong {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int[] arr1=new int[arr.length*2];
		System.out.println(Arrays.toString(arr1));
	}
}//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
```    
+ System.arraycopy(arr,i,arr1,j,n )
```   
import java.util.Arrays;
public class KuoRong {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int[] arr1=new int[arr.length];
		//(要复制元素的原数组，从哪个下标开始复制，目标数组，从哪个下标开始复制，复制元素个数)
		System.arraycopy(arr,0,arr1,0,4);
		System.out.println(Arrays.toString(arr1));
	}
}[1, 2, 3, 4, 0, 0]  
```   
+ Arrays.copyOf(arr,arr1.length) 
```  
import java.util.Arrays;
public class KuoRong {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		arr=Arrays.copyOf(arr, arr.length/2);
		System.out.println(Arrays.toString(arr));
	}
}[1, 2, 3]
```  
	
