package sub4;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * ��¥:2019.10.23
 * �̸�: �ڼ�
 * ����:�÷��� ���� �ǽ��ϱ� ���� p724
 */

public class CollectionTest {
	public static void main(String[] args) {
		
		//����Ʈ- �� ���� ���� �� ������ ����
		List<Map<Integer, Apple>> list = new ArrayList<>();	
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101,  new Apple("�ѱ�", 3000));
		m1.put(102,  new Apple("�߱�", 2500));
		m1.put(103,  new Apple("�Ϻ�", 2000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201,  new Apple("�̱�", 3000));
		m2.put(202,  new Apple("����", 2500));
		m2.put(203,  new Apple("ȣ��", 2000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�븸", 3000));
		m3.put(302, new Apple("�±�", 2500));
		m3.put(303, new Apple("��Ʈ��", 2000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//�ѱ���� info ���]
		Map<Integer, Apple> mp1 = list.get(0);
		Apple apple = mp1.get(101);
		apple.info();
		
		//ȣ�ֻ�� info���
		list.get(1).get(203).info();
		
		//�±� ��� info ���
		list.get(2).get(302).info();
		
	}

}
