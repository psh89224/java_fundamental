package test;
import point.Point;
// import java.util.Scanner; // 단순 import
import java.util.*;	// on-demand import

public class PointTest {
	public static void main(String[] args) {
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		point.Point p1 = new Point(x, y);
		System.out.println(p1.getLocation());
		sc.close();
	}

} 