package sub1;
/*
 * ��¥:2019.10.15
 * �̸�:�ڼ�
 * ����:�����ε� �ż���(�Լ�) �ǽ��ϱ� ���� p.214
 */

public class MethodOverLoad {
	public static void main(String[] args) {
		
		overload(1);
		overload(1, 9);
		overload("������");
		overload(false);
		
	}
	//overload �ż���: �ż��� �̸��� �Ȱ����� �Ű������� �����ϴ� �޼���
	public static void overload(int a) {
		System.out.println("ù��° �����ε�޼��� ����...");
	}
	public static void overload(int a, int b) {
		System.out.println("�ι�° �����ε�޼��� ����...");
	}
	public static void overload(String name) {
		System.out.println("����° �����ε�޼��� ����...");
	}
	public static void overload(boolean isOK) {
		System.out.println("�׹�° �����ε�޼��� ����...");
	}
}
