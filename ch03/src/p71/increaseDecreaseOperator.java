package p71;

/* 
 * 날짜 : 2019.10.11
 * 이름 : 박성
 * 내용 : p71 예제
*/


public class increaseDecreaseOperator 
{
	public static void main(String[] args) 
	{
		int x=10, y=10, z;
		System.out.println("-------------------");
		x++;
		++x;
		System.out.println("x="+x);
		System.out.println("-------------------");
		y--;
		--y;
		System.out.println("y="+y);
		System.out.println("-------------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------------");
		z=++x+y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
}
