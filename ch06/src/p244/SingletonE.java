package p244;

public class SingletonE {
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInStance();
		Singleton obj2 = Singleton.getInStance();
		
		if(obj1 ==obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

}
