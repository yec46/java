package sub1;
//�ڹ��� ���Ŭ������ Object�� ��ӹ޴´�. �ڹ��� �ֻ��� Ŭ����  
public class Apple extends Object{
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������: "+country);
		System.out.println("�� ��: "+price);
	}

}
