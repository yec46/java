package Ex8;
/*
 * 날짜: 2019.10.25
 * 이름: 박성
 */

public class Ex08 {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}
