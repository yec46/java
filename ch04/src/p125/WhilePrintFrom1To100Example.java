package p125;

/*
 * ��¥ : 2019.10.14
 * �̸� : �ڼ�
 * ���� : p125 1~100
*/

public class WhilePrintFrom1To100Example 
{
	public static void main(String[] args) 
	{
		int sum=0,i=1;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("1~"+(i-1)+"��:"+sum);
	}
}
