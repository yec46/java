package sub3;
/*
 * ��¥:2019.10.21
 * �̸�: �ڼ�
 * ����:Override(�����) �޼��� �ǽ��ϱ� p.295
 * �������̵�: �θ� ��ӹ޾Ƽ� �������ϴ� �� 
 */

public class Override {
	public static void main(String[] args) {
		
		BBB b= new BBB();
		b.method1();
		b.method2();
		b.method2();
		b.method3();
		
		//final �ǽ�: ���(�ٲܼ��� ����)
		//-final ����: ���
		//-final �޼���: �������̵� ����
		//-final Ŭ����: ��ӱ��� 
		final int NUM =1;
		final double PI=3.14;
		//NUM = 2; //����� ���� ������ �� ����. ����� �빮�ڷ� ǥ����. 
		
		
	}

}
