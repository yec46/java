package sub2;
/*��¥:2019.10.22
 *�̸�:�ڼ�
 *����:�پ��� ����(����)ó�� �ǽ��ϱ� p433
 */


public class VarietyExceptionTest {
	public static void main(String[] args) {
		//������ ��� �ε�����(�迭) ��������
		try {int arr[] = {1,2,3};
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//NullPoint ����
		try {
			Tiger t= new Tiger();
			Eagle e= null;
			
			t.move();
			e.move();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
		
		//ĳ���� ���� 
		try {
		Animal ani = new Tiger(); //������ ����(��ĳ����)
		Tiger t=(Tiger) ani; //�ٿ�ĳ����
		Shark s= (Shark)ani; //�߸��� ĳ����
		
		//ClassCastException 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("���α׷� ����..");
	}

}
