package Sub6;
//추상클래스(abstract):추상메서드를 갖는 클래스
public abstract class Unit {
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	//메서드 선언(구현x):추상메서드 
	public abstract void attack();
	public abstract void special();
	
}
