package p71;

/* 
 * ��¥ : 2019.10.11
 * �̸� : ������
 * ���� : p71 ����
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