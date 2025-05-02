public class Patient{
	public void printDetails(String hospitalName,String patientName,int age){
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Patient Name:"+ patientName);
		System.out.println("Age:"+ age);
	}
public static void main(String[] args){
	Patient pt=new Patient();
	pt.printDetails("City Care Hospital","John Doe",45);	
	pt.printDetails("City Car Hospital","Emma Watson",30);
}
}

