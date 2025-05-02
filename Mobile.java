public class Mobile{
	public void showDetails(String storeName,String brand,int price){
		System.out.println("Store Name:"+storeName);
		System.out.println("Mobile Brand:"+ brand);
		System.out.println("Mobile Price:"+ price);
	}
public static void main(String[] args){
	Mobile mob=new Mobile();
	mob.showDetails("Tech Word","Apple",1200);	
	mob.showDetails("Tech World","Samsung",900);
}
}

