package sub1;
/*
 * 날짜: 2019.10.28
 * 이름: 박성
 * 내용: Thread 실습하기 교재 p.576
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("서브1");
		SubThread sub2 = new SubThread("서브2");
		
		//sub1.run(); 단일스레드
		//sub2.run(); 단일스레드
		
		//비동기방식으로 실행 (막무가내...)
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			
			Thread.sleep(1000);
			
			
			System.out.println("메인 쓰레드 실행...");
		}
		System.out.println("메인 쓰레드 종료...");
	}

}
