package p290;

public class DmbCellPhone extends CellPhone{
	int channel;
	String model;
	String color;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color= color;
		this.channel= channel;
		}
	
	void turnOnDmb() {
		System.out.println("ä��"+ channel+ "�� DMB��� ������ �����մϴ�");
	}
	void changChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
