package sub2;
/*
 * ��¥:2019.10.16
 * �̸�:�ڼ�
 * ����: �ڹ�Ŭ���� �ǽ��ϱ�p.276���Ŷ�
 */

import sub1.Account;
import sub1.Computer;

public class ClassTest {
	public static void main(String[] args) {
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������","121-11-1234","������",10000);
		
		//������� �ʱ�ȭ
		//kb.bank = "��������";
		//kb.id = "121-11-1234";
		//kb.name= "������";
		//kb.money= 10000;
		
		//���Ȱ��
		//kb.deposit(20000);
		//kb.withdraw(5000);
		//kb.money-= 1;  //����ڵ�
		
		kb.info();
		
		
		//�츮���� ��ü����
		Account wr= new Account("�츮����","121-11-2234","������",10000);
		
		//������� �ʱ�ȭ
		//wr.bank = "�츮����";
		//wr.id="121-11-2234";
		//wr.name ="������";
		//wr.money=10000;
		
		//���Ȱ��
		wr.deposit(25000);
		wr.withdraw(5000);
		wr.info();
		
		//��ǻ�� ��ü����
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
