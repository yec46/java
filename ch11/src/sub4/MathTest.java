package sub4;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:Math �ǽ��ϱ� ���� p533
 */

public class MathTest {
	public static void main(String[] args) {
		
		//Math�� ��ü�� ������ �� ���� Ŭ���� 
		//Math m= new Math();
		
		System.out.println("PI: "+Math.PI);
		System.out.println("���밪: "+Math.abs(-5));
		System.out.println("���밪: "+Math.abs(-3.14));
		System.out.println("������: "+Math.sqrt(9));
		System.out.println("�ø���: "+Math.ceil(1.2));
		System.out.println("�ø���: "+Math.ceil(1.8));
		System.out.println("������: "+Math.floor(1.8));
		System.out.println("������: "+Math.floor(1.1));
		System.out.println("�ݿø�: "+Math.round(1.1));
		System.out.println("�ݿø�: "+Math.round(1.5));
		
		//random
		double num1= Math.random();
		System.out.println("num1: "+num1); //0~1���̿� �Ǽ� 
		
		double num2= num1* 10; 
		System.out.println("num2: "+num2);//0~10���̿� �Ǽ� 
		
		double num3 = Math.ceil(num2);
		System.out.println("num3: "+num3); //1~10���̿� ���� 
		
		double num4 = Math.ceil(Math.random()*100);
		System.out.println("num4: "+num4);  //�̷��� �ѹ��� �� �� ����. 
		
		
	}

}
