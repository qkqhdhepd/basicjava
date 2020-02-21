package i_collection;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 * put() : 지정된 키와 값을 저장
		 * get() : 지정된 키의 값을 반환(없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keySet() : 지정된 모든 키를 Set으로 반환
		 */
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("title", "제목입니다");
		map.put("content", "내용입니다.");
		map.put("user", "김승섭");
		map.put("date", "2020-02-20 14:48");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동");
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user"));
		
		//향상된 for문
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//두 사람의 정보를 저장하고 있는 ArrayList<HashMap<String,String>>을 만들어주세요.
		//홍길동, 남자, 30세, 프로그래머
		//이순신, 남자, 40세, 장군
		
		HashMap<String, String> test = new HashMap<>();
		test.put("name", "홍길동");
		test.put("sex", "남자");
		test.put("age", "30세");
		test.put("job", "프로그래머");
		
		for(String key : test.keySet()){
			String value = test.get(key);
			System.out.println(key + " : " + value);
		}
		
		HashMap<String, String> test1 = new HashMap<>();
		test1.put("name", "이순신");
		test1.put("sex", "남자");
		test1.put("age", "40세");
		test1.put("job", "job");
		
		for(String key : test1.keySet()){
			String value = test1.get(key);
			System.out.println(key + " : " + value);
		}
		
		//hashMap을 파라미터로 받아 저장된 모든 값을 출력하는 메소드를 만들어주세요.
		
		
	}
	private static void printMap(HashMap<String, String>map){
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
