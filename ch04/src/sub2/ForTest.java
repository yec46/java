package sub2;

/*
 * 날짜 : 2019.10.14
 * 이름 : 박성
 * 내용 : for문
*/

public class ForTest 
{
	public static void main(String[] args) 
	{
		//for
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Java!");	
		}
		System.out.print("\n");
		
		//1부터 10까지합
		int sum=0;
		for(int k=1;k<=10;k++)
		{
			sum=sum+k;
		}
		System.out.println("1부터 10까지 합:"+sum);
		System.out.print("\n");
		
		//1부터 10까지 짝수의 합
		int total=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				total+=i;
			}			
		}
		System.out.println("1부터 10까지 짝수의 합:"+total);
		System.out.print("\n");
		
		//중첩 for문
		for(int a=1;a<=3;a++)
		{
			System.out.println("a:"+a);
			for(int b=1;b<=5;b++)
			{
				System.out.println("b:"+b);
			}
		}
		System.out.print("\n");
		
		//구구단 출력
		for(int a=2;a<=9;a++) 
		{
			for(int b=1;b<=9;b++)
			{
				int c=a*b;
				System.out.println(a+"x"+b+"="+c);
			}
		}
		System.out.print("\n");
		
		//별삼각형 출력
		for(int start=1;start<=10;start++)
		{
			for(int end=1;end<=start;end++)
			{
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for(int start=10;start>=1;start--)
		{
			for(int end=1;end<=start;end++)
			{
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		//별삼각형 출력
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				System.out.print("☆");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("★");
			}
			System.out.print("\n");
		}
	}
}
