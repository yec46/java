package sub3;
/*
 * 날짜:2019.10.21
 * 이름: 박성
 * 내용:Override(덮어쓰기) 메서드 실습하기 p.295
 * 오버라이드: 부모껄 상속받아서 재정의하는 것 
 */

public class Override {
	public static void main(String[] args) {
		
		BBB b= new BBB();
		b.method1();
		b.method2();
		b.method2();
		b.method3();
		
		//final 실습: 상수(바꿀수가 없음)
		//-final 변수: 상수
		//-final 메서드: 오버라이드 금지
		//-final 클래스: 상속금지 
		final int NUM =1;
		final double PI=3.14;
		//NUM = 2; //상수는 값을 대입할 수 없다. 상수는 대문자로 표기함. 
		
		
	}

}
