package sub2;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�ڹ� ���� Ŭ���� String �ǽ��ϱ� ���� p496
 */


public class StringTest {
	public static void main(String[] args) {
		
		//���ڿ� = ����+�迭
		String s= "Hello";
		char[] c = {'H', 'e', 'l','l', 'o'};
		
		//���ڿ� ��ü����
		String str1= new String("Hello");
		String str2= new String("Hello");
		String str3= "Hello"; //���ͷ� ���� 
		String str4= "Hello"; 
		
		//���ڿ� ������(�ּ�) �� 
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ������(�ܾ�)�� ����.");
		}else {
			System.out.println("str1�� str2�� ������(�ܾ�)�� �ٸ���.");
		}
	}

}
