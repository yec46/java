package p124;

/*
 * 날짜 : 2019.10.14
 * 이름 : 이정민
 * 내용 : p124
*/

public class ForMultiplicationTableExample 
{
	public static void main(String[] args) 
	{
		int m,n;
		for(m=2;m<=9;m++) 
		{
			System.out.println("\n");	
			System.out.println("***"+m+"단***");
			for(n=1;n<=9;n++)
			{
				System.out.println(m+"x"+n+"="+(m*n));	
			}
		}
	}
}
