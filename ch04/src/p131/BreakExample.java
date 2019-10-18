package p131;

/*
 * 날짜 : 2019.10.14
 * 이름 : 박성
 * 내용 : p131
*/

public class BreakExample 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6)
			{
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
