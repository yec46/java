package sub1;

import sub1.Outer.Inner;

/*��¥:2019.10.22
 *�̸�:�ڼ�
 *����:��ø Ŭ���� �ǽ��ϱ� ���� p.390
 */


public class InnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(1);
		out.info();
		
		Inner inn= out.new Inner(2);
		inn.info();
	}

}
