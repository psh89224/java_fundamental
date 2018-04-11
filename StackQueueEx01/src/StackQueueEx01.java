import java.util.*;


public class StackQueueEx01 {
	public static void main(String[] args) {
		Stack<String> st = new Stack <String> ();
		Queue<String> q = new LinkedList<String> ();
		
		st.push("0");	// 스택 저장
		st.push("1");
		st.push("2");
		
		q.offer("0");	// 큐 저장
		q.offer("1");
		q.offer("2");
		
		System.out.println("=Stack=");
		while(!st.empty()) {
			System.out.println(st.pop());	// 스택 추출
		}
		
		System.out.println("=Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());	// 큐 추출
		}
	}
}