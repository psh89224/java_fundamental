import java.util.*;



public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		// 1번 방법 - map의 entrySet을 만들어 사용하는 방법
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+"점수 : "+e.getValue());
		}
		
		// 2번 방법 - map의 keySet을 만들어 사용하는 방법
		set = map.keySet();
		System.out.println("참가자 명단 : " +set);		
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext() ) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.min(values));
		
		// 3번 방법 - map의 keySet을 만들어 사용하는 방법 (키를 통해서 값을 구하는 방법)
		set = map.keySet();
		it = set.iterator();
		
		int sum=0;
		int max=0, min=100;
		while(it.hasNext()) {
			String name = (String)it.next();
			int score = (int)map.get(name);
			sum += score;
			
			if(max < score) max = score;
			if(min > score) min = score;
		}
		System.out.println("=============");
		System.out.println("합계 : " +sum);
		System.out.println("평균 : " +(float)sum/set.size());
		System.out.println("최댓값 : " +max);
		System.out.println("최솟값 : " +min);
		
	}
}