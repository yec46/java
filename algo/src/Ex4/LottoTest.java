package Ex4;
import java.util.*;

public class LottoTest {
	/*
	 * ��¥ : 2019.10.25
	 * �̸� : �ڼ�
	 * ���� : �˰��� �ǽ� - �ζǹ�ȣ ���� 
	 * 
	 * ���߰���
	 * 1) 6�� �ݺ��� �����ؼ� �ζǹ�ȣ�� �������� �ϳ��� �����ؼ� �迭�� ����
	 * 2) ������ ���� ���ڸ� �迭�� �����Ҷ� �̹� �迭�� ����� ��ȣ������ �ߺ�üũ
	 * 3) �ߺ�üũ�� �迭�� ��� ���Ҹ� ���ʴ�� ��
	 * 4) �ߺ��� �߰ߵǸ� �ش� index��° �迭�� ���Ҹ� �ٽ� ���� ���� ���ؼ� �ߺ�üũ  
	 * 5) �迭�� ����� ��ȣ�� ������������ ���� �� ����ϱ�
	 */
		public static void main(String[] args) {
			
				int[] lotto = new int[6];

			for(int i=0 ; i<6 ; i++) {

				// 1 ~ 45�� �� �������� �ϳ� ����
				int num =(int) Math.ceil(Math.random()*45);

				//lotto �迭�� ����
				lotto[i]= num;
				
				

				// �ߺ�üũ
				for(int j=0; j<i;j++) {
					if(num == lotto[j]) {
						i--;
						break;
					}
				}
		}

			// �迭���Ҹ� ������������ ����
			Arrays.sort(lotto);

			// �迭 ���� ���
			for(int num:lotto) {
				System.out.print(num+" ");
			}


		}
}

		