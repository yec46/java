package sub2;

public class AnonyObjectTest {
	public static void main(String[] args) {
		//�͸�ü new Person ���� ��Ʈ�ѽ����̽��� 
		//-�������̽��� Ŭ���� ����(implements)���� new�������� ������ ���� 
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info...");
				
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello");
		
				
			}
		};
		
		p.info();
		p.hello();
	}

}
