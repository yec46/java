package p290;

public class DmbCellPhoneE extends CellPhone{
	
	public DmbCellPhoneE(String model, String color, int channel) {
	
		
	}

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changChannelDmb(12);
		dmbCellPhone.turnOffDmb();
				
	}

}
