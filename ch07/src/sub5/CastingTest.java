package sub5;

import sub4.Animal;
import sub4.Eagle;
import sub4.Tiger;

/*
 * ��¥:2019.10.21
 * �̸�: �ڼ�
 * ����:ĳ���� �ǽ��ϱ� p.306
 */
public class CastingTest {
	 public static void main(String[] args) {
		 //ĳ����- Ÿ�Ժ�ȯ
		 int num1= 1;
		 double num2= num1;
		 
		 double var1= 1.23;
		 int var2= (int)var1;
		 
		 //��ĳ����(������ ����)
		 Animal a1 = new Tiger();
		 Animal a2= new Eagle();
		 
		 //�ٿ�ĳ����
		 Tiger t= (Tiger)a1;
		 Eagle e = (Eagle) a2;
		 
		 t.move();
		 e.move();
		 
		 
	}

}
