package sub1;

public class FruitBox<T> {
	private T fruit;
	
	//Getter: �ܺη� ���(����)�� �����ϱ����� �޼��� 
	public T getFruit() {
		return fruit;
	}
	
	//Setter: �ܺο��� Ŭ������ ����� ���޹ޱ����� �޼��� 
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
