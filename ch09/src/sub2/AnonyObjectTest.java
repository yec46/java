package sub2;

public class AnonyObjectTest {
	public static void main(String[] args) {
		//익명객체 new Person 쓰고 컨트롤스페이스바 
		//-인터페이스를 클래스 구현(implements)없이 new연산으로 정의한 형태 
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
