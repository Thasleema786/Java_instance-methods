public class Car{
	public void displayDetails(String showroomName,String modelName,int price){
		System.out.println("Showroom Name:"+showroomName);
		System.out.println("Car Model:"+modelName);
		System.out.println("Price:"+price);
	}
public static void main(String[] args){
Car car=new Car();

 car.displayDetails("BMW KUN Exclusive","BMW 7 Series",8200000);
 car.displayDetails("Aerocity","Tesla Model 3",6000000);


}
}