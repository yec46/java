package sub5;

import java.util.Calendar;

/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:Calendar �ǽ��ϱ� ���� p538
 */


public class CalendarTest {
	public static void main(String[] args) {
		
		//�̱��� ��ü 
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		
		int hour =cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d�� %d�� %d��\n",year, month, date);
		System.out.printf("%d: %d: %d\n",hour, min, sec);
	}

}
