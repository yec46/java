package p213;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxspeed;
	
	//������
	Car(){
		
	}
	
	Car(String model){
		this(model, "����", 250);
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color =color;
		this.maxspeed = maxspeed;
	}

}
