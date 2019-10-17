package sub2;
/*
 * 날짜:2019.10.16
 * 이름:박성
 * 내용: 자바클래스 실습하기p.276보거라
 */

import sub1.Account;
import sub1.Computer;

public class ClassTest {
	public static void main(String[] args) {
		
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행","121-11-1234","김유신",10000);
		
		//멤버변수 초기화
		//kb.bank = "국민은행";
		//kb.id = "121-11-1234";
		//kb.name= "김유신";
		//kb.money= 10000;
		
		//기능활용
		//kb.deposit(20000);
		//kb.withdraw(5000);
		//kb.money-= 1;  //취약코드
		
		kb.info();
		
		
		//우리은행 객체생성
		Account wr= new Account("우리은행","121-11-2234","김유신",10000);
		
		//멤버변수 초기화
		//wr.bank = "우리은행";
		//wr.id="121-11-2234";
		//wr.name ="김유신";
		//wr.money=10000;
		
		//기능활용
		wr.deposit(25000);
		wr.withdraw(5000);
		wr.info();
		
		//컴퓨터 객체생성
		Computer samsung= new Computer("INTEL i7", "8GB", "1TB");
		Computer imac= new Computer("INTEL i5", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
		
	}
}
