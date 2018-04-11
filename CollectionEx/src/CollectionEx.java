import java.util.*;
import static java.util.Collections.*;

public class CollectionEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println("addAll="+list);
		
		rotate(list, 2);	// ���������� ��ĭ�� �̵�
		System.out.println("rotate(2)="+list);
		
		swap(list, 0,2);	// ù��°�� ����° ����
		System.out.println("swap(0,2)="+list);
		
		shuffle(list);		// ���Ǻ���
		System.out.println("shuffle="+list);
		
		sort(list);		// ����
		System.out.println("sort="+list);
		
		sort(list, reverseOrder());		// ��������
		System.out.println("reverseOrder="+list);
		
		int idx = binarySearch(list, 3);		// 3�� ����� ��ġ(index)��ȯ
		System.out.println("index if 3 = " +idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9);		// list�� 9�� ä���
		System.out.println("list="+list);
		
		// list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ����Ұ�
		List newList = nCopies(list.size(),2);
		System.out.println("newList="+newList);
		
		System.out.println(disjoint(list, newList));	// �����Ұ� ������ true
		
		copy(list, newList);
		System.out.println("newList="+newList);
		System.out.println("list="+list);
		replaceAll(list, 2, 1);
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2="+list2);
	
	}
}
