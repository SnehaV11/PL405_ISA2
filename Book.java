
public class Book{
	private float bookPrice;
	
	public void calculateDiscount() {
		
		if(bookPrice > 500) {
		System.out.println("Price of the book before calculating discount is Rs." + bookPrice);
			
		int discount = 10;
			
		float finalPrice = bookPrice - (bookPrice * discount / 100);
		System.out.println("Price of the book after calculating discount is Rs." + finalPrice);
		
		}
		else {
		System.out.println("Price of the book is Rs." + bookPrice);
		}
	}
	
	public float getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
}
