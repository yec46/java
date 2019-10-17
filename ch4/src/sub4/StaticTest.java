package sub4;
/*
 * 날짜: 2019.10.17
 * 이름: 박성
 * 내용: 장적영역변수, 메서드실습하기 p.236
 */

public class StaticTest {
	public static void main(String[] args) {
		//Increment inc1=new Increment();
		//Increment inc2=new Increment();
		//Increment inc3=new Increment();
		
		
		//정적 변수(클래스변수),정적메서드(클래스메서드)는 이미 고정할당역역(method area)에 
		//생성되어있기때문에 
		//객체 생성 없이 바로 참조할 수 있다
		Increment.num2 =10;
		Increment.add();
		
		System.out.println("num2: "+Increment.num2);
		
		Calc c= Calc.getInstance();
		
		int rs1= c.plus(1, 2);
		int rs2= c.minus(1, 2);
		int rs3= c.multi(3, 2);
		int rs4= c.div(4, 2);
				
				System.out.println("rs1 : "+rs1);
				System.out.println("rs2 : "+rs2);
				System.out.println("rs3: "+rs3);
				System.out.println("rs4 : "+rs4);
	}

}
