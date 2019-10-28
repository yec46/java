package sub2;
/*
 * 날짜:2019.10.23
 * 이름: 박성
 * 내용:재내릭클래스 실습하기 교재 p654
 */

public class MultiGenericTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s10");
		
		p1.info();
		p2.info();
		
	}

}
