package sub1;

//람다식으로 사용하기위한 인터페이스선언 어노테이션
@FunctionalInterface
public interface Type3 {
	//하나의 추상메서드만 선언 가능. 두개 선언 안됨.
	public int fx(int x, int y);

}
