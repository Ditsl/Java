package demo;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//求100 以内所有能被3 整除但不能被5 整除的数字的和
		
		/*int sum=0;
		for (int i=1;i<=100;i++){
		
			if(i%3==0 && i%5!=0){
			sum+=i;
			}
		
		}System.out.println(sum);//1368
*/		
		/*“百钱买百鸡”是我国古代的著名数学题。题目这样描述：3文钱可以买1只公鸡，
		2文钱可以买一只母鸡，1文钱可以买3只小鸡。用100 文钱买100 只鸡，那么各有公鸡、母鸡、小鸡多少只？*/
		
		/*for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				int k=100-i-j;
				if(i*3+j*2+k/3==100 && k%3==0){
					System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
				}
			}
		}
		公鸡：0母鸡：40小鸡：60
		公鸡：5母鸡：32小鸡：63
		公鸡：10母鸡：24小鸡：66
		公鸡：15母鸡：16小鸡：69
		公鸡：20母鸡：8小鸡：72
		公鸡：25母鸡：0小鸡：75*/
		

		
		//搬砖问题：36块砖，36人搬，男搬4，女搬3，两个小孩抬1砖，要求一次全搬完，问男、女和小孩各若干？
		
		/*for(int i=0;i<=36;i++){
			for(int j=0;j<=36;j++){
				int k=36-i-j;
				if(i*4+j*3+k/2==36 && k%2==0){
					System.out.println("男："+i+"女："+j+"孩："+k);
				}
			}
		}男：3女：3孩：30*/
		
		
		/*托运计费问题：
		当货物重量小于20公斤的时候，收费5元，大于20公斤小于100公斤的时候超出20公斤的部分按每0.2元每公斤计费，如果超出100公斤的
		时候，超出的部分按照每公斤0.15元计算。
		读入货物的重量，输出计算之后货物的运费。*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入货物重量：");
		int w=sc.nextInt();
		if(w<20){
			System.out.println("费用5元");
		}else if(20<=w & w<100){
			double p=5+(w-20)*0.2;
			System.out.println("费用为"+p+"元");
		}else if(w>=100){
			double p=5+80*0.2+(w-100)*0.15;
			System.out.println("费用为"+p+"元");
		}*/
			
		
		//读入一个三位数，计算其各位数字之和。例如： 123,各位数字之和为6
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int i=sc.nextInt();
		int a=i/100;
		int b=i/10%10;
		int c=i%10;
		System.out.println(a+b+c);*/
		
		//编程找出四位整数abcd 中满足下述关系的数:(ab+cd)(ab+cd)=abcd
		
		/*for(int i=1000;i<=9999;i++){
			int a=i/1000;
			int b=i/100%10;
			int c=i/10%10;
			int d=i%10;
			if((a*10+b+c*10+d)*(a*10+b+c*10+d)==(1000*a+100*b+10*c+d)){
				System.out.println(i);
			}
		}
		2025
		3025
		9801*/
		
		//计算n以内的阶乘
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++){
			s*=i;
		}System.out.println(s);*/
		
		
		/*读入一个整数n，输出如下图形:
		  当输入 n=3时，输出:
		  *
		 ***
		*****
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("* ");
			}System.out.print("\n");
		}*/
		
		
		//输入一个整数， 计算它各位上数字的和。（注意：是任意位的整数）
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数n");
		long n=sc.nextLong();
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n=n/10;
		}System.out.println(sum);*/
		
		
		//输入一整数A，判断它是否质数。
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数A");
		int A=sc.nextInt();
		boolean flag=true;
		if(A<2){
			System.out.println(A+"不是质数");
			flag=false;
		}
		for(int i=2;i<A;i++){
			if(A%i==0){
				System.out.println(A+"不是质数");
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println(A+"是质数");
		
		
		//一个int 类型的整数由32 个二进制位组成，每个二进制位的值要么为0要么为1。要求读入一个int 类型的整数n，计算它的32 个二进制位中总共有多少位为1？
		
			/*Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个整数：");
			int n=sc.nextInt();
			int count=0;
			while(n!=0){
				count++;
				n=n&(n-1);
			}
			for(int i=0;i<32;i++){
				
				if((n&1)==1){
					count++;
				}n>>=i;
			}
			
			System.out.println(count);*/
			
			//已知：faibonacci（费波那契）数列的前几个数分别为0，1，1，2，3，5……。从第3 项开始，每一项都等于前两项的和。读入一个整数n，编程求出此数列的前n项。
			
			/*Scanner sc=new Scanner(System.in);
			System.out.println("请输入位数");
			int n=sc.nextInt();
			boolean flag=true;
			if(n<1){
				System.out.println("输入数据有误");
				flag=false;
			}
			if(n==1){
				System.out.println(0);
				flag=false;
			}
			if(n==2){
				System.out.println(0+"\t"+1);
				flag=false;
			}
			if(n==3){
				System.out.println(0+"\t"+1+"\t"+1);
				flag=false;
			}
			int f1=1;
			int f2=1;
			int next=0;
			if(flag)
			System.out.print(0+"\t"+1+"\t"+1+"\t");
			for(int i=4;i<=n;i++){
				next=f2+f1;
				f1=f2;
				f2=next;
				System.out.print(next+"\t");
			}*/
			
		
		//如果一个数等于其所有因子之和,我们就称这个数为"完数",例如6 的因子为1,2,3,6=1+2+3,6就是一个完数.请编程打印出1000 以内所有的完数
		
		/*for(int i=1;i<1000;i++){
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
		6
		28
		496*/

		
		
		
		/*计算圆周率:中国古代数学家研究出了计算圆周率最简单的办法:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......这个算式
		的结果会无限接近于圆周率的值,我国古代数学家祖冲之计算出,圆周率在3.1415926和3.1415927 之间,请编程计算,要想得到这样的结
		果,他要经过多少次加减法运算?*/
		
			/*double pi=0.0;
			double base=1.0;
			int count=0;
			int prefix=1;
			while(pi<3.1415926||pi>3.1415927){
				pi+=prefix*(4/base);
				count++;
				base+=2;
				prefix*=-1;
			}
			System.out.println(count);*/
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
