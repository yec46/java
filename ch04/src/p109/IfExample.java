package p109;

/*
 * 날짜 : 2019.10.14
 * 이름 : 이정민
 * 내용 : p109
*/

public class IfExample 
{
	public static void main(String[] args) 
	{
		int score=93;
		if(score>=90) 
		{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90)
		{
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");			
		}
	}
}
