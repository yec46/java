package Ex05;
/*
 * ��¥:2019.10.25
 * �̸�: �ڼ�
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
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}


