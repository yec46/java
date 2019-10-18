package p244;

public class SingletonE {
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInStance();
		Singleton obj2 = Singleton.getInStance();
		
		if(obj1 ==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
