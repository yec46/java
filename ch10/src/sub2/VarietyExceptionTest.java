package sub2;
/*날짜:2019.10.22
 *이름:박성
 *내용:다양한 예외(에러)처리 실습하기 p433
 */


public class VarietyExceptionTest {
	public static void main(String[] args) {
		//범위에 벗어나 인덱스값(배열) 참조에러
		try {int arr[] = {1,2,3};
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//NullPoint 에러
		try {
			Tiger t= new Tiger();
			Eagle e= null;
			
			t.move();
			e.move();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
		
		//캐스팅 에러 
		try {
		Animal ani = new Tiger(); //다형성 적용(업캐스팅)
		Tiger t=(Tiger) ani; //다운캐스팅
		Shark s= (Shark)ani; //잘못된 캐스팅
		
		//ClassCastException 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("프로그램 종료..");
	}

}
