package sub1;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�ڹ� ���� Ŭ���� Object �ǽ��ϱ� ���� p457
 */


public class ObjectTest {
	public static void main(String[] args) {
		Apple a1 = new Apple("�ѱ�", 2000);
		Apple a2 = new Apple("�̱�", 1000);
		
		Banana b1= new Banana("�븸", 2500);
		Banana b2= new Banana("����", 3500);
		
		//�������� Ȱ��Ǵ� Object Ŭ���� 
		Object fruit[] = {a1, a2, b1, b2};
		
		//
		Apple f1=(Apple)fruit[0];
		Banana f2=(Banana)fruit[2];
		
		f1.info();
		f2.info();
	}
	

}
