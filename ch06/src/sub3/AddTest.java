package sub3;
/*
 * ��¥:2019.10.16
 * �̸�:�ڼ�
 * ����:Ŭ���� �޸� ����
 */


public class AddTest {
	public static void main(String[] args) {
		
		Adder ad1 = new Adder();
		ad1.x = 100;
		
		int[] arr = {10, 20, 30};
		
		ad1.add(100);
		System.out.println("ad1.x ="+ad1.x);
		
		ad1.add(ad1);
		System.out.println("ad1.x = "+ad1.x);
		
		ad1.add(arr);
		System.out.println("arr[0]= "+arr[0]);
		
		ad1 = ad1.addNew(ad1);
		System.out.println("ad1.x = "+ad1.x);
		
		
	

	}
}
