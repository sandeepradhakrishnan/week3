package week3.day1;

public class StudentInfo {
public void getStudentInfo(int id) {
System.out.println("id" +id);
}
public void getStudentInfo(String  name) {
	System.out.println("name" +name);
}
public void getStudentInfo(String email,long phoneNumber) {
	System.out.println("email" +email);
	System.out.println("phoneNumber" +phoneNumber);
}
	
	
	public static void main(String[] args) {
		StudentInfo get=new StudentInfo();
		get.getStudentInfo(46);
		get.getStudentInfo("Sandy");
		get.getStudentInfo("sandy@gmail.com",9998887776l);
	}

}
