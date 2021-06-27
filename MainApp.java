
public class MainApp{
	
	public static void main(String[] args) {
		float bookPrice = 501;
		
		Book bk = new Book();
		bk.setBookPrice(bookPrice);
		
		bk.calculateDiscount();
	}
}
