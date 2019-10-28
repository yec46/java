package sub2;
/*
 * ��¥: 2019.10.28
 * �̸�: �ڼ�
 * ����: ���ٽ� �ǽ��ϱ� ���� p.678
 */


public class LambdaThreadTest {
	public static void main(String[] args) throws Exception {
		
		Runnable r = ()->{
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� ������ ����....");
			}
		};
		Thread t= new Thread(r);
		t.start();
		
		for(int i=1; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("���� ������ ����...");
		}
		System.out.println("���α׷�����...");
		
	}

}
