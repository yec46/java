package p124;

/*
 * ��¥ : 2019.10.14
 * �̸� : ������
 * ���� : p124
*/

public class ForMultiplicationTableExample 
{
	public static void main(String[] args) 
	{
		int m,n;
		for(m=2;m<=9;m++) 
		{
			System.out.println("\n");	
			System.out.println("***"+m+"��***");
			for(n=1;n<=9;n++)
			{
				System.out.println(m+"x"+n+"="+(m*n));	
			}
		}
	}
}