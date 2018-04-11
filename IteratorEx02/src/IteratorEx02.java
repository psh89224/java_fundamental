import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx02 {
	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<String>(10);
		ArrayList<String> copy1 = new ArrayList<String>(10);
		ArrayList<String> copy2 = new ArrayList<String>(10);
		
		for(int i=0; i<10; i++) 
			original.add(i+"");
			
			Iterator<String> it = original.iterator();
			
			while(it.hasNext() ) 
				copy1.add(it.next() );
			
			System.out.println("= Original���� copy1�� ���� =");
			System.out.println("original:"+original);
			System.out.println("copy1:"+copy1);
			System.out.println();
			
			it = original.iterator();
			
			while(it.hasNext() ) {
				copy2.add(it.next() );
				it.remove();
			}
			System.out.println("= Original���� copy2�� �̵�(remove) =");
			System.out.println("original:"+original);
			System.out.println("copy2:"+copy2);
		}
}
