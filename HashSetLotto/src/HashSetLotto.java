import java.util.*;


public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() <6; i++) {	// i<6; 
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));		// autoboxing °¡´É
		}
		
		System.out.println(set);
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
