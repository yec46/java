package p133;

/*
 * ��¥ : 2019.10.14
 * �̸� : �ڼ�
 * ���� : p133
*/

public class ContinueExample 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}