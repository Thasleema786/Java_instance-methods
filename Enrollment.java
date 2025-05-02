public class Enrollment{
public String getEnrollmentInfo(String platform,String course,String student){
	return "Platform:"+platform+"\nCourse:"+course+"\nStudent:"+student;
  	}
public static void main(String[] args){
 	Enrollment er=new Enrollment();
	System.out.println(er.getEnrollmentInfo("Udemy","Java Programming","Alice"));
	System.out.println(er.getEnrollmentInfo("Udemy","Web Development","Bob"));
}
}