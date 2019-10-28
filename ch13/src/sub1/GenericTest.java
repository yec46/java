package sub1;
/*
 * 날짜:2019.10.23
 * 이름: 박성
 * 내용:재내릭클래스 실습하기 교재 p654
 */

public class GenericTest {
	public static void main(String[] args) {
		
		
		Apple a= new Apple("한국", 2000);
		Banana b= new Banana("미국", 1500);
		
		FruitBox<Apple> box1 =new FruitBox<>();
		box1.setFruit(a);
		
		FruitBox<Banana> box2 =new FruitBox<>();
		box2.setFruit(b);
		
		Apple fr1= box1.getFruit();
		Banana fr2= box2.getFruit();
		
		fr1.info();
		fr2.info();
		
		
		
	}

}
