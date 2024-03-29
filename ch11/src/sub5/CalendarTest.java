package sub5;

import java.util.Calendar;

/*
 * 날짜:2019.10.23
 * 이름: 박성
 * 내용:Calendar 실습하기 교재 p538
 */


public class CalendarTest {
	public static void main(String[] args) {
		
		//싱글톤 객체 
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		
		int hour =cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일\n",year, month, date);
		System.out.printf("%d: %d: %d\n",hour, min, sec);
	}

}
