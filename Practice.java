package demo;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//��100 ���������ܱ�3 ���������ܱ�5 ���������ֵĺ�
		
		/*int sum=0;
		for (int i=1;i<=100;i++){
		
			if(i%3==0 && i%5!=0){
			sum+=i;
			}
		
		}System.out.println(sum);//1368
*/		
		/*����Ǯ��ټ������ҹ��Ŵ���������ѧ�⡣��Ŀ����������3��Ǯ������1ֻ������
		2��Ǯ������һֻĸ����1��Ǯ������3ֻС������100 ��Ǯ��100 ֻ������ô���й�����ĸ����С������ֻ��*/
		
		/*for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				int k=100-i-j;
				if(i*3+j*2+k/3==100 && k%3==0){
					System.out.println("������"+i+"ĸ����"+j+"С����"+k);
				}
			}
		}
		������0ĸ����40С����60
		������5ĸ����32С����63
		������10ĸ����24С����66
		������15ĸ����16С����69
		������20ĸ����8С����72
		������25ĸ����0С����75*/
		

		
		//��ש���⣺36��ש��36�˰ᣬ�а�4��Ů��3������С��̧1ש��Ҫ��һ��ȫ���꣬���С�Ů��С�������ɣ�
		
		/*for(int i=0;i<=36;i++){
			for(int j=0;j<=36;j++){
				int k=36-i-j;
				if(i*4+j*3+k/2==36 && k%2==0){
					System.out.println("�У�"+i+"Ů��"+j+"����"+k);
				}
			}
		}�У�3Ů��3����30*/
		
		
		/*���˼Ʒ����⣺
		����������С��20�����ʱ���շ�5Ԫ������20����С��100�����ʱ�򳬳�20����Ĳ��ְ�ÿ0.2Ԫÿ����Ʒѣ��������100�����
		ʱ�򣬳����Ĳ��ְ���ÿ����0.15Ԫ���㡣
		���������������������֮�������˷ѡ�*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("���������������");
		int w=sc.nextInt();
		if(w<20){
			System.out.println("����5Ԫ");
		}else if(20<=w & w<100){
			double p=5+(w-20)*0.2;
			System.out.println("����Ϊ"+p+"Ԫ");
		}else if(w>=100){
			double p=5+80*0.2+(w-100)*0.15;
			System.out.println("����Ϊ"+p+"Ԫ");
		}*/
			
		
		//����һ����λ�����������λ����֮�͡����磺 123,��λ����֮��Ϊ6
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i=sc.nextInt();
		int a=i/100;
		int b=i/10%10;
		int c=i%10;
		System.out.println(a+b+c);*/
		
		//����ҳ���λ����abcd ������������ϵ����:(ab+cd)(ab+cd)=abcd
		
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
		
		//����n���ڵĽ׳�
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int n=sc.nextInt();
		int s=1;
		for(int i=1;i<=n;i++){
			s*=i;
		}System.out.println(s);*/
		
		
		/*����һ������n���������ͼ��:
		  ������ n=3ʱ�����:
		  *
		 ***
		*****
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("������һ������n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("* ");
			}System.out.print("\n");
		}*/
		
		
		//����һ�������� ��������λ�����ֵĺ͡���ע�⣺������λ��������
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("������һ������n");
		long n=sc.nextLong();
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n=n/10;
		}System.out.println(sum);*/
		
		
		//����һ����A���ж����Ƿ�������
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������A");
		int A=sc.nextInt();
		boolean flag=true;
		if(A<2){
			System.out.println(A+"��������");
			flag=false;
		}
		for(int i=2;i<A;i++){
			if(A%i==0){
				System.out.println(A+"��������");
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println(A+"������");
		
		
		//һ��int ���͵�������32 ��������λ��ɣ�ÿ��������λ��ֵҪôΪ0ҪôΪ1��Ҫ�����һ��int ���͵�����n����������32 ��������λ���ܹ��ж���λΪ1��
		
			/*Scanner sc=new Scanner(System.in);
			System.out.println("������һ��������");
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
			
			//��֪��faibonacci���Ѳ����������е�ǰ�������ֱ�Ϊ0��1��1��2��3��5�������ӵ�3 �ʼ��ÿһ�����ǰ����ĺ͡�����һ������n�������������е�ǰn�
			
			/*Scanner sc=new Scanner(System.in);
			System.out.println("������λ��");
			int n=sc.nextInt();
			boolean flag=true;
			if(n<1){
				System.out.println("������������");
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
			
		
		//���һ������������������֮��,���Ǿͳ������Ϊ"����",����6 ������Ϊ1,2,3,6=1+2+3,6����һ������.���̴�ӡ��1000 �������е�����
		
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

		
		
		
		/*����Բ����:�й��Ŵ���ѧ���о����˼���Բ������򵥵İ취:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......�����ʽ
		�Ľ�������޽ӽ���Բ���ʵ�ֵ,�ҹ��Ŵ���ѧ�����֮�����,Բ������3.1415926��3.1415927 ֮��,���̼���,Ҫ��õ������Ľ�
		��,��Ҫ�������ٴμӼ�������?*/
		
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
