package sub2;

/*
 * ��¥ : 2019.10.14
 * �̸� : ������
 * ���� : for��
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
		
		//1���� 10������
		int sum=0;
		for(int k=1;k<=10;k++)
		{
			sum=sum+k;
		}
		System.out.println("1���� 10���� ��:"+sum);
		System.out.print("\n");
		
		//1���� 10���� ¦���� ��
		int total=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				total+=i;
			}			
		}
		System.out.println("1���� 10���� ¦���� ��:"+total);
		System.out.print("\n");
		
		//��ø for��
		for(int a=1;a<=3;a++)
		{
			System.out.println("a:"+a);
			for(int b=1;b<=5;b++)
			{
				System.out.println("b:"+b);
			}
		}
		System.out.print("\n");
		
		//������ ���
		for(int a=2;a<=9;a++) 
		{
			for(int b=1;b<=9;b++)
			{
				int c=a*b;
				System.out.println(a+"x"+b+"="+c);
			}
		}
		System.out.print("\n");
		
		//���ﰢ�� ���
		for(int start=1;start<=10;start++)
		{
			for(int end=1;end<=start;end++)
			{
				System.out.print("��");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for(int start=10;start>=1;start--)
		{
			for(int end=1;end<=start;end++)
			{
				System.out.print("��");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		//���ﰢ�� ���
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5-a;b++)
			{
				System.out.print("��");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("��");
			}
			System.out.print("\n");
		}
	}
}