package Ex8;
/*
 * ��¥: 2019.10.25
 * �̸�: �ڼ�
 */

public class Ex08 {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}
