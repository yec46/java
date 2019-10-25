package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�÷��� �����ӿ�ũ LIST �ǽ��ϱ� ���� p724
 * �÷���(�ڷᱸ��): 
 * 1)����Ʈ:�����߿�, �ߺ�x 
 * 2)set(����):�ߺ����� 
 * 3)map 
 */
public class ListTest {
	public static void main(String[] args) {
		
		//����Ʈ ���� �� ������ ����:�ڵ���ڽ�
		List<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.remove(2);   //����
		list1.add(0, 5);   //��ü�� �ֱ� 
		list1.add(3, 3);
		
		//����Ʈ ���� ��� 
		System.out.println("list1 1��° ����: "+list1.get(0));
		System.out.println("list1 3��° ����: "+list1.get(2));
		System.out.println("list1 4��° ����: "+list1.get(3));
		
		//����Ʈ ���� �� ����������
		List<String> list2 = new ArrayList<>();
		
		list2.add("������");
		list2.add("�̼���");
		list2.add("�����");
		
		//����Ʈ �ݺ���
		for(String name : list2) {
			System.out.println("list2 ����: "+name);
		}
		
		//��� ����Ʈ ���� �� ��� ����
		Apple a1= new Apple("�ѱ�", 3000);
		Apple a2= new Apple("�̱�", 2000);
		Apple a3= new Apple("�±�", 1000);
		
		List<Apple> list3=new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		//�����ü���� .size
		System.out.println("��ü ��� ����: "+list3.size());
		
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
	}

}
