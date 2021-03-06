package oop;

class Student {
	private int admno;
	private String name;
	private int course, feepaid;
	
	// Static method 
	public static int getTotalFee(int course) {
		if (course == 1)
			return 10000;
		else if (course == 2)
			return 15000;
		else
			return 8000;
	}
	
	public Student(int admno, String name, int course) {
		this.admno = admno;
		this.name = name;
		this.course = course;
	}

	public Student(int admno, String name, int course, int feepaid) {
		this(admno, name, course);
		this.feepaid = feepaid;
	}

	// Instance Methods
	public void pay(int amount) {
		this.feepaid += amount;
	}

	public int getDue() {
		return Student.getTotalFee(this.course) - this.feepaid;
	}

	public void print() {
		System.out.println(this.admno);
		System.out.println(this.name);
		System.out.println(this.course);
		System.out.println(this.feepaid);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		System.out.println(Student.getTotalFee(2));
		
		Student s = new Student(1, "Mark", 2);
		s.pay(5000);
		s.pay(3000);
		System.out.println(s.getDue());
	
	}

}
