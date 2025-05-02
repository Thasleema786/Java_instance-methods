public class Travel{
public String getBookingDetails(String agency,String destination,int travellers){
	return "Agency:"+agency+"\nDestination:"+destination+"\nTravellers:"+travellers;
}
public static void main(String[] args){
  	Travel tl=new Travel();
	System.out.println(tl.getBookingDetails("Wanderlust Travels","Paris",2));
	System.out.println(tl.getBookingDetails("Wanderlust Travels","Tokyo",3));
}
}