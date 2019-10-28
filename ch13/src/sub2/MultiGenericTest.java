package sub2;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�系��Ŭ���� �ǽ��ϱ� ���� p654
 */

public class MultiGenericTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s10");
		
		p1.info();
		p2.info();
		
	}

}
