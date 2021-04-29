package KodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Ertan","Sidar","es3@gmail.com","es123","React-Java Course");
		Instructor instructor = new Instructor(1, "Engin", "Demiroð", "ed3@gmail.com", "ed123", "Java-React");
		student.showInformation();
		System.out.println("**********************");
		instructor.showInformation();
		
		System.out.println("**********************");
		StudentManager studentManager= new StudentManager();
		studentManager.addUser(student);
		studentManager.deleteUser(student);
		
		System.out.println("**********************");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.deleteUser(instructor);

	}

}
