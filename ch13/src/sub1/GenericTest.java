package sub1;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�系��Ŭ���� �ǽ��ϱ� ���� p654
 */

public class GenericTest {
	public static void main(String[] args) {
		
		
		Apple a= new Apple("�ѱ�", 2000);
		Banana b= new Banana("�̱�", 1500);
		
		FruitBox<Apple> box1 =new FruitBox<>();
		box1.setFruit(a);
		
		FruitBox<Banana> box2 =new FruitBox<>();
		box2.setFruit(b);
		
		Apple fr1= box1.getFruit();
		Banana fr2= box2.getFruit();
		
		fr1.info();
		fr2.info();
		
		
		
	}

}
