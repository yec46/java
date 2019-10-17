package p122;

/*
 * 날짜 : 2019.10.14
 * 이름 : 이정민
 * 내용 : p122
*/

public class ForSumFrom1To100Example 
{
	public static void main(String[] args) 
	{
		int sum=0,i;
		for(i=1;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("1~100의 합:"+sum);
	}
}
