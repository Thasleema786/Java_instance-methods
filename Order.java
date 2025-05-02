public class Order{
public String getOrderDetails(String restaurantName,String foodItem,int quantity){
		return "Restaurant Name:"+restaurantName+"\nFood Item:"+foodItem+"\nQuantity:"+quantity;
	}
public static void main(String[] args){
	Order or=new Order();
	System.out.println(or.getOrderDetails("Spice Garden","Paneer Butter Masala",2));
	System.out.println(or.getOrderDetails("Spice Garden","Chicken Biryani",1));
}
}