package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜:2019.10.23
 * 이름: 박성
 * 내용:컬렉션 프레임워크 LIST 실습하기 교재 p724
 * 컬렉션(자료구조): 
 * 1)리스트:순서중요, 중복x 
 * 2)set(집합):중복가능 
 * 3)map 
 */
public class ListTest {
	public static void main(String[] args) {
		
		//리스트 생성 및 데이터 저장:자동언박싱
		List<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.remove(2);   //제거
		list1.add(0, 5);   //객체에 넣기 
		list1.add(3, 3);
		
		//리스트 원소 출력 
		System.out.println("list1 1번째 원소: "+list1.get(0));
		System.out.println("list1 3번째 원소: "+list1.get(2));
		System.out.println("list1 4번째 원소: "+list1.get(3));
		
		//리스트 생성 및 데이터저장
		List<String> list2 = new ArrayList<>();
		
		list2.add("김유신");
		list2.add("이순신");
		list2.add("정약용");
		
		//리스트 반복문
		for(String name : list2) {
			System.out.println("list2 원소: "+name);
		}
		
		//사과 리스트 생성 및 사과 저장
		Apple a1= new Apple("한국", 3000);
		Apple a2= new Apple("미국", 2000);
		Apple a3= new Apple("태국", 1000);
		
		List<Apple> list3=new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		//사과전체갯수 .size
		System.out.println("전체 사과 갯수: "+list3.size());
		
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
	}

}
