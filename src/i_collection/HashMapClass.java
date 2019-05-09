package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()		: 지정된 키와 값을 저장
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * get()		: 지정된 키의 값을 저장 (없으면 null)
		 * keySet()	: 저장된 모든 키를 Set로 반환
		 */
		
		//              <key 타입 과 값의 타입저장>    key는 주로 String을 사용
		HashMap<String, String> map = new HashMap<String	, String>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map.put("title", "제목");
		map.put("content", "내용");
		map.put("user", "사용자");
		map.put("user", "사용자2");   //이렇게되면 뒤에것이 앞에서 덮어씀
		map1.put("목록", "엄마는 외계인");
		map1.put("목록1", "슈팅스타");
		map1.put("목록2", "맛있겠다");
		map.remove("user");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map1.get("목록"));
		System.out.println(map1.get("목록1"));
		System.out.println(map1.get("목록2"));
		
		// map에 저장된 모든 내용을 출력
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		
		//한번에 받기
		Iterator<String> itr2 = map.keySet().iterator();
		
		
		while(itr.hasNext()){		//itr에 값이 있는지 없는지 확인하고 모든 인덱스들을 돌고난다음 false값을 반환한다.
			String key = itr.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();  // 테이블과 같은 형태
		
		for(int i =0; i < list.size(); i++){
			HashMap<String, Object> map2 = list.get(i);
			
			map2.put("key", "value");
			System.out.println(map2.get("title"));
		}
	}

}
