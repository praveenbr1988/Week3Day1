package Week3Day1;

public class Student extends Department {

	public void studentName() {
		System.out.println("studentName");
	}
	
	public void studentDept() {
		System.out.println("studentDept");
	}
	
	public void studentId() {
		System.out.println("studentId");
	}
	
	public void studentInfo(int id) {
		System.out.println("Id is : "+id);
	}
	
	public void studentInfo(int id, String name) {
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
	}
	
	public void studentInfo(String email, String phoneno) {
		System.out.println("Email Id is : "+email);
		System.out.println("Phone no is : "+phoneno);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student ();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentId();
		std.studentDept();
		std.studentInfo(262075);
		std.studentInfo(262075, "Praveen");
		std.studentInfo("Praveenbr1988@gmail.com", "9842185354");
		
		
		
	}

}
