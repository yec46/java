package sub1;
/*
 * ��¥:2019.10.15
 * �̸�: �ڼ�
 * ����:�޼��� ���� ������ �޸�
 */
public class MethodScoprTest {
	public static void main(String[] args) {
		int result = 0;
		int start= 1;
		int end= 10;
		result=sum(start, end);
		System.out.println("���: "+result);
	}
public static int sum(int s, int e) {
	int sum = 0;
	for(int k=s; k<=e; k++) {
		sum +=k;
	}
	return sum;
	
}
}
