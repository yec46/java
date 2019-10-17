package p89;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 이정민
 * 내용 : p89 예제2
*/

public class CompareOperator2 
{
	public static void main(String[] args) 
	{
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
		System.out.println((int)(v4*10)==(int)(v5*10));
	}
}
