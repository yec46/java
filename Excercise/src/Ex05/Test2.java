package Ex05;
/*
 * ��¥:2019.10.25
 * �̸�: �ڼ�
 */

public class Test2 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
			if(result) {
				System.out.println("�α��εǾ����ϴ�.");
				memberService.logout("hong");
			}else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			}
		
	}

}
