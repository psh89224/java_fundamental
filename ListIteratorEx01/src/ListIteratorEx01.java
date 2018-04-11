import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext() ) {
			System.out.println(it.next() );
		}
		System.out.println();
		
		while(it.hasPrevious() ) {
			System.out.println(it.previous());
		}
		System.out.println();
	}
}