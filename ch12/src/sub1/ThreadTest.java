package sub1;
/*
 * ��¥: 2019.10.28
 * �̸�: �ڼ�
 * ����: Thread �ǽ��ϱ� ���� p.576
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("����1");
		SubThread sub2 = new SubThread("����2");
		
		//sub1.run(); ���Ͻ�����
		//sub2.run(); ���Ͻ�����
		
		//�񵿱������� ���� (��������...)
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			
			Thread.sleep(1000);
			
			
			System.out.println("���� ������ ����...");
		}
		System.out.println("���� ������ ����...");
	}

}
