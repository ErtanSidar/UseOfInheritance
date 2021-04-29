package KodlamaIo;

public class StudentManager extends UserManager{
	
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " Student added to system");
	}
	public void deleteUser(User user) {
		System.out.println(user.getFirstName() + " Student deleted from system");
	}

}
