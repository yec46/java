package sub2;

/*
 * ��¥ : 2019.10.14
 * �̸� : �ڼ�
 * ���� : while��
*/

public class WhileTest 
{
	public static void main(String[] args) 
	{
		//1���� 10������ ��
		int k=1,sum=0;
		while(k<=10)
		{
			sum+=k;
			k++;
		}
		System.out.println("1���� 10������ ��:"+sum);
	
		//do~while
		int total=0,i=1;
		do
		{
			if(i%2==1)
			{
				total+=i;
			}
			i++;
		}
		while(i<=10);
		System.out.println("1���� 10���� Ȧ���� ��:"+total);
		
		//break
		int num=0;
		while(true)
		{
			num++;
			if(num%5==0&&num%7==0)
			{
				break;
			}
		}
		System.out.println("5�� 7�� �ּҰ����:"+num);
		
		//continue
		int total1=0;
		for(int a=1;a<=10;a++)
		{
			if(a%2==0)
			{
				continue; //�ݺ��� �����̵�
			}
			total1+=a;
		}
		System.out.println("1���� 10���� Ȧ���� ��:"+total1);
	}
}
