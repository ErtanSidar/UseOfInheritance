package KodlamaIo;

public class Student extends User {
	
	private String enrolledCourse;
	
	public Student(int userId, String fistName, String lastName, String email, String password,String enrolledCourse) {
		super(userId,fistName,lastName,email,password);
		this.enrolledCourse=enrolledCourse;
	}

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println("Course Name :"+getEnrolledCourse());
	}

}
