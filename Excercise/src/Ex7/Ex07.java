package Ex7;
/*
 * ��¥: 2019.10.25
 * �̸�: �ڼ�
 */

public class Ex07 {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
	}

}
