package week3.day1;

public class Student {
	public void getStudentInfo(int stdId)
	{
		System.out.println("Student ID : "+stdId);
	}
	
	public void getStudentInfo(int stdId, String stdName)
	{
		System.out.println("Student ID : "+stdId);
		System.out.println("Student Name : "+stdName);
	}
	
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Student email : "+email);
		System.out.println("Student PhoneNumber : "+phoneNumber);
	}

	public static void main(String[] args) 
	{
		Students std = new Students();
		std.getStudentInfo(12345);
		std.getStudentInfo(12345, "Hari");
		std.getStudentInfo("Hari@gmail.com", 1234567890);
		

	}
}
