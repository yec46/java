package sub1;

public class Banana {
	
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������: "+country);
		System.out.println("�� ��: "+price);
	}

}
