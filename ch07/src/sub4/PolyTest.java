package sub4;
/*
 * ��¥:2019.10.21
 * �̸�: �ڼ�
 * ����:������ �ǽ��ϱ� p.305
 */

public class PolyTest {
	public static void main(String[] args) {
		
		//������- ��ü�� ����Ÿ���� �θ�Ŭ���� �����ϴ� ��,��? ���α׷��ڵ��� �����ϰ� ������� 
		Animal t= new Tiger();
		Animal e= new Eagle();
		Animal s= new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
	}


}
