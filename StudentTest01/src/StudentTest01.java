import java.util.Arrays;

interface Comparable {
	int compareTo(Object other);
}

class Student implements Comparable {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	
	@Override
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		if (this.gpa < other.gpa)
			return -1;
		else if (this.gpa>other.gpa)
			return 1;
		else
			return 0;
	}
}
public class StudentTest01 {
	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student("홍길동", 3.39);
		students[1] = new Student("임꺽정", 4.21);
		students[2] = new Student("황진이", 2.19);
		students[3] = new Student("박석현", 2.29);
		
		for (Student s : students) {
			System.out.println("이름=" +s.getName() +", 평점=" +s.getGpa());
		}
		System.out.print("평점이 가장 높은 학생은 ?");
		int max = 0;
		for(int i=1; i<students.length; i++) {
			if (students[max].getGpa() < students[i].getGpa())
				max = i;
		}
		System.out.println("이름=" +students[max].getName()
				+ ", 평점=" +students[max].getGpa());
		
		if(students[0].compareTo(students[1]) >0)
			System.out.println(students[0].getName()+ "이 " 
					+ students[1].getName()+"보다 평점이 높습니다");
		else
			System.out.println(students[1].getName()+ "이 "
					+ students[0].getName()+"보다 평점이 높거나 같습니다.");
		
	}
}