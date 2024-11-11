package _11ArrayList;

import java.util.ArrayList;

public class ListSample {
	
	ArrayList<String> a = new ArrayList<>();
	
	public ListSample() {
		System.out.println("리스트의 길이 " + a.size());
		a.add("apple");
		System.out.println("리스트의 길이 " + a.size());
		a.add("banana");
		System.out.println(a);
		a.add("carrot");
		System.out.println(a);
		a.remove("banana");
		System.out.println(a);
		a.add("banana");
		System.out.println(a);
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).charAt(0) != 'a') {
				System.out.println(a.get(i));
			}
		}
		// 리스트 전체 삭제
		a.clear();
		a.add(0,"aligator");
		a.add(1,"bird");
		a.add(2,"dragon");
		System.out.println(a);
		// 2번째 인덱스부터 밀림 
		a.add(2, "cat");
		System.out.println(a);
		// 리스트 쉊ㅇ
		a.set(0,  "anaconda");
		System.out.println(a);
		
	}

}
