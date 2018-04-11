
public class StringTest01 {
	public static void main(String[] args) {
		
		// charAt 예제
		/*String s = "Hello";
		String n = "0123456";
		char c = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c);
		System.out.println(c2);*/
		
		// concat 예제
		/*String s = "Hello";
		String s2 = s.concat(" World");
		// s.concat(" World");		// s 출력시 Hello만 나옴.. 잘못된사용
		System.out.println(s);
		System.out.println(s2);*/
		
		// contains 예제
		/*String s = "abcdefg";
		boolean b = s.contains("de");
		System.out.println(b);*/
		
		// endsWith와 startsWith
		/*String file = "Hello.txt";
		boolean b = file.endsWith("txt");
		String s = "java.lang.Object";
		boolean b2 = s.startsWith("java");
		boolean b3 = s.startsWith("lang");
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);*/
		
		// equals와 equalsIgnoreCase
		/*String s = "Hello";
		boolean b = s.equals("Hello");
		boolean b2 = s.equals("hello");
		boolean b3 = s.equalsIgnoreCase("HELLO");
		boolean b4 = s.equalsIgnoreCase("hello");
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/
		
		// indexOf
		/*String s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		int idx3 = s.indexOf('e',0);
		int idx4 = s.indexOf('e',2);
		
		String s1 = "ABCDEFG";
		int idx5 = s1.indexOf("CD");
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		System.out.println(idx5);*/
		
		// split
		/*String animals = "dog,cat,bear";
		String [] arr = animals.split(",",2);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		// substring
		String s = "java.lang.Object";
		String c = s.substring(10);
		String p = s.substring(5, 9);
		
		System.out.println(c);
		System.out.println(p);
				
	}

}
