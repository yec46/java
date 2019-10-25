package Ex2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.omg.PortableInterceptor.Interceptor;
/*
 * ��¥: 2019.10.25
 * �̸�:�ڼ�
 * ����: �˰��� �ǽ�- �ߺ����� ã�� 
 * 
 * ���߰���
 * 1)nums1�� ù��° ���� 6�� �ڿ� �ִ� 3,5,3,7�� ���ʷ� ��, 6�� �ߺ��� ���� �߰� ����.
 * 2)�ι�° ���� 3�� �ڿ� �ִ� 5,3,7,�� ���ʷ� ��, �տ� �ִ� 6���� �̹� ������, 4��° �ڸ� 3�� �ߺ��߰�.
 * 3)�߰ߵ� �ߺ� ���� 3�� ���� resultSet�� ����
 * 4)resultSet�� ����� ������ ���
 */

public class FindSameNum {
	public static void main(String[] args) {
		//���߿� ������
		int[] numbs1 = {6,3,5,3,7};
		
		// �׽�Ʈ�� ������
		int[] numbs2 = {1, 5, 9, 7, 5, 3, 2, 5, 3, 1};

		Set<Integer> resultSet = findSameNumber(numbs1);

		//�������
		Iterator<Integer> it=resultSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+",");
		}
				
			
		}
		
		// fineSameNumber �޼��� ����
		public static Set<Integer> findSameNumber(int[] numbs){
			Set<Integer>resultSet = new HashSet<>();
			for(int i=0; i<numbs.length;i++) {
				for(int j=i+1; j<numbs.length;j++) {
					if(numbs[i] == numbs[j]) {
						resultSet.add(numbs[i]);
					}
				}
					
			}return resultSet;
		}
}
		
