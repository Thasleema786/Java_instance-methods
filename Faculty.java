public class Faculty{
	public void showFacultyDetails(String universityName,String facultyName,String department){
		System.out.println("univesityName:"+universityName);
		System.out.println("Faculty Name:"+ facultyName);
		System.out.println("Department:"+ department);
	}
public static void main(String[] args){
	Faculty fac=new Faculty();
	fac.showFacultyDetails("Stanford University","Dr.Robert Brown","Computer Science");	
	fac.
showFacultyDetails("Stanford University","Dr.Lisa Green","Physics");
}
}

