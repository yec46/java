package p51;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 박성
 * 내용 : p51 예제
*/

public class PromotionExample 
{
	public static void main(String[] args) 
	{
		byte byteValue=10;
		int intValue=byteValue;
		System.out.println(intValue);
		char charValue='가';
		intValue=charValue;
		System.out.println("가의 유니코드="+intValue);
		intValue=500;
		long longValue=intValue;
		System.out.println(longValue);
		intValue=200;
		double doubleValue=intValue;
		System.out.println(doubleValue);
	}
}
