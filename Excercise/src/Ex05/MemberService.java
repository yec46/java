package Ex05;
/*
 * 날짜:2019.10.25
 * 이름: 박성
 */

public class MemberService {
	public boolean login(String id, String password) {
			if(id.equals("hong") && password.equals("12345")) {
				return true;
			}else {
				return false;
			}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}


