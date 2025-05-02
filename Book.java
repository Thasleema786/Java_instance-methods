public class Book{
	public void displayInfo(String libraryName,String title,String author){	
		System.out.println("Library Name:"+libraryName);
		System.out.println("Title Name:"+title);
		System.out.println("Author Name:"+author);
		}
public static void main(String[] args){
	Book bk=new Book();
		bk.displayInfo("City public Library","The Great Gatsby","F.Scott Fitzgerald");
		bk.displayInfo("City public Library","1984","George Orwell");
     }
}
					