package sub5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:Date �ǽ��ϱ� ���� p538
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("d: "+d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("������ yyyy/MM/dd HH:mm:ss �Դϴ�.");
		String now =sdf.format(d);
		
		System.out.println(now);
	}

}
