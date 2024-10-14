public class Book {
	private String bookCode;
	private String bookName;
	private float price;
	private String author;

	public Book(String bookCode, String bookName, float price, String author) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public String getBookCode() {
		return this.bookCode;
	}
	public void setBookCode(String newBookCode) {
		this.bookCode = newBookCode;
	}

	public String getBookName() {
		return this.bookName;
	}
	public void setBookName(String newBookName) {
		this.bookName = newBookName;
	}

	public float getPrice() {
		return this.price;
	}
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
}
