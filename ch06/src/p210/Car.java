package p210;
import 
public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	public Car(){
		
	}
	public Car(String model){
		this.model = model;
	}
	public Car(String madel, String color){
		this.model = model;
		this.color= color;
	}
	public Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
		
	}
}
