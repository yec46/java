package sub2;

public class Account {
	
	//특성(멤버 변수)-캡슐화해야된다.
	//private 보호막(캡슐화)
	private String bank;
	private String id;
	private String name;  
	private int money;   
	
	//생성자- 객체 생성할때 멤버변수를 초기화하는 메서드, 클래스 대문자
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id= id;
		this.name=name;
		this.money=money;
	}
	
	
	//기능(멤버 메서드)
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money-=money;
	}
	public void info() {
		System.out.println("=====================================");
		System.out.println("은행명: "+this.bank);
		System.out.println("계좌번호: "+this.id);
		System.out.println("입금주: "+name);
		System.out.println("현재잔액: "+money);
		System.out.println("-------------------------------------");
	}
	

	


}
