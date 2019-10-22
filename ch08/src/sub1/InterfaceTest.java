package sub1;
/*날짜:2019.10.22
 * 이름:박성
 * 내용:인터페이스 실습하기 교재p344
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		//인터페이스 실습1- 클래스 설계의 표준 가이드역할 
		//RemoteControl로 다형성 주기 
		RemoteControl lg= new RemotelLG();
		RemoteControl samsung = new RemotelSumsung();
		
		lg.powerOff();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}
	

}
