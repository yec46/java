package p82;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 이정민
 * 내용 : p82 예제2
*/

public class AccuracyExample2 
{
	public static void main(String[] args) 
	{
		int apple=1;
		int totalPieces=apple*10;
		int number=7;
		int temp=totalPieces-number;
		double result=temp/10.0;
		System.out.println("사과 한 개 에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result+"조각이 남는다.");
	}
}
