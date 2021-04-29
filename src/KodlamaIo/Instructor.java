package KodlamaIo;

public class Instructor extends User {
	
	private String gaveCourse;
	
	public Instructor(int userId, String fisrtName, String lastName, String email, String password,String gaveCourse) {
		super(userId, fisrtName, lastName, email, password);
		this.gaveCourse=gaveCourse;
		
	}

	public String getGaveCourse() {
		return gaveCourse;
	}

	public void setGaveCourse(String gaveCourse) {
		this.gaveCourse = gaveCourse;
	}
	@Override
	public void showInformation( ) {
		super.showInformation();
		System.out.println("Gave Course :"+getGaveCourse());
	}

	

}
