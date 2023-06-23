package herarchicalInheritance;

public class SchoolMain {

	public static void main(String[] args) {
		Teacher tr = new Teacher("fortworth", 20000, 2357, "Math");
		System.out.println(tr.subject);
		System.out.println(tr.location);
		System.out.println(tr.learn(56, 5600));
		tr.teaching();

		System.out.println("****************************************");

		Student stu = new Student("texas", 2456, 456, "male");
		System.out.println(stu.gender);
		stu.passtest();
		
	}

}
