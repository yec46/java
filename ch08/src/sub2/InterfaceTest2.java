package sub2;
/*날짜:2019.10.22
 * 이름:박성
 * 내용:인터페이스 실습하기 교재p344
 */

public class InterfaceTest2 {
	public static void main(String[] args) {
		
		//인터페이스 실습2- 다중 상속의 역할
		//TV로 다형성 x: 부팅 인터넷 안됨, 컴퓨터로 다형성x :끄고 키는 것 실행안됨 
		SmartTV stv =new SmartTV();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}

}
