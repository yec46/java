package sub2;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화블럭선언으로 스레드간 경합을 막는다. 무조건 하나의 스레드만 들어오고 나머지는 대기하게 함.
	public synchronized void setNum() {
		this.num++;
	}
}
