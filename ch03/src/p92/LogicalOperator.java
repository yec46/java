package p92;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 박성
 * 내용 : p92 예제
*/

public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int charCode='A';
		if((charCode>=65)&&(charCode<=90)) 
		{
			System.out.println("대문자 이군요");
		}
		if((charCode>=97)&&(charCode<=122))
		{
			System.out.println("소문자 이군요");
		}
		if((charCode<48)&&!(charCode>57))
		{
			System.out.println("0~9숫자 이군요");
		}
		int value=6;
		if((value%2==0)||(value%3==0))
		{
			System.out.println("2 또는 3의 배수 이군요");
		}
		if((value%2==0)||(value%3==0))
		{
			System.out.println("2 또는 3의 배수 이군요");
		}
			
	}
}
