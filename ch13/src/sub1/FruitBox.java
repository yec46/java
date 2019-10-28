package sub1;

public class FruitBox<T> {
	private T fruit;
	
	//Getter: 외부로 멤버(과일)를 전달하기위한 메서드 
	public T getFruit() {
		return fruit;
	}
	
	//Setter: 외부에서 클래스의 멤버를 전달받기위한 메서드 
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
