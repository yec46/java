package Ex03;
/*
 * ��¥:2019.10.25
 * �̸�: �ڼ�
 */
public class Test3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��: "+sum);
	}

}
