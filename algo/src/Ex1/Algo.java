package Ex1;
/*
 * ��¥: 2019.10.25
 * �̸�:�ڼ�
 * ����: �˰��� �ǽ�- �ִ밪 ã��
 * ���߰���
 * 1) �迭�� 1��° ���� 17�� �ִ����� maxNum�� ����
 * 2)2��° ���� 92�� ���� �ִ� 17�� ��,92�� 17���� ũ�Ƿ� �ִ��� 92�ιٲ�����
 * 3)3��° ���� 18�� ���� �ִ��� 92�� ��, 18�� 92���� �����Ƿ� maxNum�� �������� ����.
 * 4)4��° ���ں��� ���������� ���� ������ �ݺ�
 */

public class Algo {
	public static void main(String[] args) {
		
		//���߿� ������
		
		int nums[] = {17, 92, 18, 33, 58,7, 33, 42};
		int maxNum= nums[0];
		for(int i=0; i<nums.length; i++) {
			if(maxNum<nums[i]) {
				maxNum = nums[i];
			}
			
		}
		
		
		
		
		
		
		
		System.out.println("nums �ִ�: "+maxNum);
		
		
		
	}

}
