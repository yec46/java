package sub2;
/*��¥:2019.10.22
 * �̸�:�ڼ�
 * ����:�������̽� �ǽ��ϱ� ����p344
 */

public class InterfaceTest2 {
	public static void main(String[] args) {
		
		//�������̽� �ǽ�2- ���� ����� ����
		//TV�� ������ x: ���� ���ͳ� �ȵ�, ��ǻ�ͷ� ������x :���� Ű�� �� ����ȵ� 
		SmartTV stv =new SmartTV();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}

}
