package p201;

public class CarE {
	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ�� : "+myCar.Company);
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("���� : "+myCar.color);
		System.out.println("�ְ�ӵ� : "+myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: "+myCar.speed);
	}

}
