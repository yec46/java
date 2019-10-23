package sub2;
/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�ڹ� ���� Ŭ���� String �ǽ��ϱ� ���� p496
 */


public class StringMemberTest {
	public static void main(String[] args) {
		
		String str= "Hello Korea";
		
		//length ���ڿ� ����
		System.out.println("str ���ڿ� ����: "+str.length());
		
		//charAt:���� ����
		System.out.println("str 6��° ����: "+str.charAt(6));
		
		//substring()-���ڿ� �ڸ���
		System.out.println("str 0-5���� ���ڿ�: "+str.substring(0,5));
		System.out.println("str 6���� ���������� ���ڿ�: "+str.substring(6));
		
		//IndexOf():�պ��� ã��,     - Ư�������� �ε��� �� ����
		//lastIndexOf():�ں��� ã��    - Ư�������� �ε��� �� ����
		int idx1= str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("idx1: "+idx1);
		System.out.println("idx2: "+idx2);
		
		//replace()-���ڿ� ��ü
		String rs = str.replace("Korea", "Busan");
		System.out.println("rs: "+rs);
		
		//valueOf()-�Ϲ�Ÿ�� ������ ���ڿ��� ��ȯ, �⺻Ÿ�� �� ���ڿ��� ��ȯ
		int var1= 1;
		double var2= 2.12;
		boolean var3 = true;
		
		String s1 =String.valueOf(var1) ;
		String s2 =String.valueOf (var2);
		String s3 =""+var3;
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		
	}

}
