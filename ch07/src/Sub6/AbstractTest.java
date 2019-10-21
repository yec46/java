package Sub6;
/*
 * 날짜:2019.10.21
 * 이름: 박성
 * 내용:추상클래스 실습하기 p.329
 * -추상매서드를 갖는 클래스
 * -상속을 위한 클래스 
 * -구조화된 클래스 설계를 제공한다.
 */

public class AbstractTest {
	public static void main(String[] args) {
		//추상클래스는 객체생성 안됨
		//Unit unit = new Unit();
		
		Unit u1 = new Marin();
		Unit u2 =  new Zealot();
		Unit u3 = new Zergling();
		
		u1.move();
		u1.attack();
		u1.special();
		
		u2.move();
		u2.attack();
		u2.special();
		
		u3.move();
		u3.attack();
		u3.special();
			
		
	
	}
}
