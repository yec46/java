package p112;

/*
 * 날짜 : 2019.10.14
 * 이름 : 박성
 * 내용 : p112
*/

public class IfElseIfExample 
{
	public static void main(String[] args) 
	{
		int score=75;
		if(score>=90) 
		{
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score>=80)
		{
			System.out.println("점수가 80~89 입니다");
			System.out.println("등급은 B입니다.");
		}
		else if(score>=70)
		{
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}
		else
		{
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}
