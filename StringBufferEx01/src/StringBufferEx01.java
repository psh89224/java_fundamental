
public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = sb.append("123").append("22");
		
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
				
		String s = "abc";
		String s2 = s.concat("123");
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());		
	}
}