public class Ticket{
public String getTicketInfo(String theaterName,String movieName,String seatNo){
		return "Theater Name:"+theaterName+"\nMovie Name:"+movieName+"\nSeat No:"+seatNo;
	}
public static void main(String[] args){
	Ticket tk=new Ticket();
	System.out.println(tk.getTicketInfo("Galaxy Cinemas","Interstellar","A10"));
	System.out.println(tk.getTicketInfo("Galaxy Cinemas","Inception","B12"));
}
}