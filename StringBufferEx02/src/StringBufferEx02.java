
public class StringBufferEx02 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2));
		System.out.println("===============");
		
		String sb3 = sb.toString();
		String sb4 = sb2.toString();
		
		System.out.println(sb3 == sb4);
		System.out.println(sb3.equals(sb4));
		System.out.println("===============");
		
		String s = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		/*System.out.println("sb == sb2 ? " + (sb ==sb2));
		System.out.println("sb.equlas(sb2) ? " + sb.equals(sb2));*/
		
		// StringBuffer의 내용을 String으로 변환한다.
	}

}
