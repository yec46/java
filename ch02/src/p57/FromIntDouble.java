package p57;

/* 
 * ��¥ : 2019.10.11
 * �̸� : �ڼ�
 * ���� : p57 ����
*/

public class FromIntDouble 
{
	public static void main(String[] args) 
	{
		int num1=123456780, num2=123456780;
		double num3=num2;
		num2=(int)num3;
		int result=num1-num2;
		System.out.println(result);
	}
}
