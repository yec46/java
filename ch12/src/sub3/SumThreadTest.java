package sub3;
/*
 * 날짜: 2019.10.28
 * 이름: 박성
 * 내용: 쓰레드 실습하기 교재 p.576
 */


public class SumThreadTest {
	public static void main(String[] args) throws Exception {
		SubThread st1 = new SubThread(1, 50);
		SubThread st2 = new SubThread(51, 100);
		
		//멀티스레드로 바꿔쥼
		Thread t1= new Thread(st1);
		Thread t2= new Thread(st2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1+rs2;
		
		System.out.println("결과: "+tot);
	}

}
