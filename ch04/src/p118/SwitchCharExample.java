package p118;

/*
 * 날짜 : 2019.10.14
 * 이름 : 이정민
 * 내용 : p118
*/

public class SwitchCharExample
{
	public static void main(String[] args) 
	{
		char grade='B';
		switch(grade)
		{
			case'A':
			case'a':
				System.out.println("우수 회원 입니다.");
				break;
			case'B':
			case'b':
				System.out.println("일반 회원 입니다.");
				break;
			default:
				System.out.println("손님 입니다.");
				break;
		}
	}
}
