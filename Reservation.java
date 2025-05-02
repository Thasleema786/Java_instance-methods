public class Reservation{
public String getReservationDetails(String hotelName,String guestName,int nights){
	return "Hotel Name:"+hotelName+"\nGuest Name:"+guestName+"\nNights:"+nights;
}
public static void main(String[] args){
	Reservation res=new Reservation();
System.out.println(res.getReservationDetails("Grand Place","David",3));
System.out.println(res.getReservationDetails("Grand Place","Maria",2));
}
}