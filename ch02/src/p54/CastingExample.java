package p54;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 이정민
 * 내용 : p54 예제
*/

public class CastingExample 
{
	public static void main(String[] args) 
	{
		int intValue=44032;
		char charValue=(char)intValue;
		System.out.println(charValue);
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue);
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(intValue);
	}
}
