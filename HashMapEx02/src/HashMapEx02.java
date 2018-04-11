import java.util.*;



public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		// 1�� ��� - map�� entrySet�� ����� ����ϴ� ���
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey()+"���� : "+e.getValue());
		}
		
		// 2�� ��� - map�� keySet�� ����� ����ϴ� ���
		set = map.keySet();
		System.out.println("������ ��� : " +set);		
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext() ) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("���� : "+total);
		System.out.println("��� : "+(float)total/set.size());
		System.out.println("�ְ����� : "+Collections.max(values));
		System.out.println("�������� : "+Collections.min(values));
		
		// 3�� ��� - map�� keySet�� ����� ����ϴ� ��� (Ű�� ���ؼ� ���� ���ϴ� ���)
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
		System.out.println("�հ� : " +sum);
		System.out.println("��� : " +(float)sum/set.size());
		System.out.println("�ִ� : " +max);
		System.out.println("�ּڰ� : " +min);
		
	}
}