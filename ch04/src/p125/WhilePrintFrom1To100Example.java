package p125;

/*
 * 날짜 : 2019.10.14
 * 이름 : 박성
 * 내용 : p125 1~100
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
		System.out.println("1~"+(i-1)+"합:"+sum);
	}
}
