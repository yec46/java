package sub1;
/*��¥:2019.10.22
 * �̸�:�ڼ�
 * ����:�������̽� �ǽ��ϱ� ����p344
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		//�������̽� �ǽ�1- Ŭ���� ������ ǥ�� ���̵忪�� 
		//RemoteControl�� ������ �ֱ� 
		RemoteControl lg= new RemotelLG();
		RemoteControl samsung = new RemotelSumsung();
		
		lg.powerOff();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}
	

}
