package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add()		: 마지막 위치에 객체를 추가
		 * get()		: 지정된 위치에 객체를 반환
		 * size()		: 저장된 객체의 수 반환
		 * remover()	: 지정된 위치의 객체를 제거
		 * 
		 */
		
		ArrayList<Object> list	 = new ArrayList<Object>();
		
		
		list.add(1);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");		//0번 인덱스에 저장
		list2.add("123");		//1번 인덱스에 저장
		
		for(int i =0; i <list2.size(); i++){
			System.out.println(list2.get(i));
			list2.remove(i);
		}
		
		ArrayList<ArrayList<Integer>> list3 =	new ArrayList<ArrayList<Integer>>();     // int형 2차원 배열과 같음
		
		list3.add(new ArrayList<Integer>());		//0번 인덱스에 저장
		list3.add(new ArrayList<Integer>());		// 1번 인덱스에 저장
		
		ArrayList<Integer> a1 = list3.get(0);    // 0번 인덱스를 반환
		ArrayList<Integer> a2 = list3.get(0);	// 1번을 인덱스를 반환
		
		a1.add(10);
		a2.add(20);
		list3.get(0).add(10);
		
		for(int i =0; i < list3.size(); i++){
			ArrayList<Integer> list4 = list3.get(i);
			for(int j= 0; j < list4.size(); j++){
				System.out.println(list4.get(j));
				
			}
		}
	}

}
