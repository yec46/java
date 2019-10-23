package sub2;
/*
 * 날짜:2019.10.23
 * 이름: 박성
 * 내용:자바 내장 클래스 String 실습하기 교재 p496
 */


public class StringMemberTest {
	public static void main(String[] args) {
		
		String str= "Hello Korea";
		
		//length 문자열 길이
		System.out.println("str 문자열 길이: "+str.length());
		
		//charAt:문자 추출
		System.out.println("str 6번째 문자: "+str.charAt(6));
		
		//substring()-문자열 자르기
		System.out.println("str 0-5까지 문자열: "+str.substring(0,5));
		System.out.println("str 6부터 마지막까지 문자열: "+str.substring(6));
		
		//IndexOf():앞부터 찾음,     - 특정문자의 인덱스 값 추출
		//lastIndexOf():뒤부터 찾음    - 특정문자의 인덱스 값 추출
		int idx1= str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("idx1: "+idx1);
		System.out.println("idx2: "+idx2);
		
		//replace()-문자열 교체
		String rs = str.replace("Korea", "Busan");
		System.out.println("rs: "+rs);
		
		//valueOf()-일반타입 변수를 문자열로 변환, 기본타입 → 문자열로 변환
		int var1= 1;
		double var2= 2.12;
		boolean var3 = true;
		
		String s1 =String.valueOf(var1) ;
		String s2 =String.valueOf (var2);
		String s3 =""+var3;
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		
	}

}
