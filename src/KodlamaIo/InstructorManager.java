package KodlamaIo;

public class InstructorManager extends UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " Instructor added to system");
	}
	
	public void deleteUser(User user) {
		 System.out.println(user.getFirstName() + " Instructor deleted from system");
	}
	
	

}
