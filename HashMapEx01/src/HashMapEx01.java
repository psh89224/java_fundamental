import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		map.put("asdf", "2222");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է��آB����");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�. �ٽ��Է����ּ���");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}sc.close();
	}
	
}
