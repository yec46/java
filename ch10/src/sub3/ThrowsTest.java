package sub3;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:���� ������(Throws) �ǽ��ϱ� 
 */

public class ThrowsTest {
	public static void main(String[] args) {
		Calc cal = new Calc();
		
		int rs1 = cal.plus(1, 2);
		int rs2 = cal.miuns(1, 2);
		int rs3 = cal.mult(1, 2);
		int rs4=0;
		try {
			rs4 = cal.div(1, 0);
		} catch (Exception e) {
			//���޵� ������ ó�� 
			e.printStackTrace();
		}
		
		
		System.out.println("rs1: "+rs1);
		System.out.println("rs2: "+rs2);
		System.out.println("rs3: "+rs3);
		System.out.println("rs4: "+rs4);
		
		System.out.println("���α׷� ����...");
	}
	

}
