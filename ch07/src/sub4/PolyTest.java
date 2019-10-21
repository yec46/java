package sub4;
/*
 * 날짜:2019.10.21
 * 이름: 박성
 * 내용:다형성 실습하기 p.305
 */

public class PolyTest {
	public static void main(String[] args) {
		
		//다형성- 객체의 선언타입을 부모클래스 지정하는 것,왜? 프로그램코딩을 유연하게 만들어줌 
		Animal t= new Tiger();
		Animal e= new Eagle();
		Animal s= new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
	}


}
