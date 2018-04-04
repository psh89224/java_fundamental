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
		students[0] = new Student("ȫ�浿", 3.39);
		students[1] = new Student("�Ӳ���", 4.21);
		students[2] = new Student("Ȳ����", 2.19);
		students[3] = new Student("�ڼ���", 2.29);
		
		for (Student s : students) {
			System.out.println("�̸�=" +s.getName() +", ����=" +s.getGpa());
		}
		System.out.print("������ ���� ���� �л��� ?");
		int max = 0;
		for(int i=1; i<students.length; i++) {
			if (students[max].getGpa() < students[i].getGpa())
				max = i;
		}
		System.out.println("�̸�=" +students[max].getName()
				+ ", ����=" +students[max].getGpa());
		
		if(students[0].compareTo(students[1]) >0)
			System.out.println(students[0].getName()+ "�� " 
					+ students[1].getName()+"���� ������ �����ϴ�");
		else
			System.out.println(students[1].getName()+ "�� "
					+ students[0].getName()+"���� ������ ���ų� �����ϴ�.");
		
	}
}