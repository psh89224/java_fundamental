import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// 1锅 规过
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("======");		
		// 2锅 规过
		Iterator<String> it = list.iterator();
		while(it.hasNext() ) {
			Object obj = it.next();
			System.out.println(obj);
		}
	} //main
}
