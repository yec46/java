package Ex05;
/*
 * 날짜:2019.10.25
 * 이름: 박성
 */

public class Test2 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
			if(result) {
				System.out.println("로그인되었습니다.");
				memberService.logout("hong");
			}else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
		
	}

}
