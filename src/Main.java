public class Main {
	public static void main(String[] args) {
		Book[] books = new Book[6];
		books[0] = new Book("123", "abc", 456, "Thang");
		books[1] = new Book("456", "cde", 789, "Tri");
		books[2] = new Book("789", "ghi", 1234, "Dung");
		books[3] = new Book("1234", "jkl", 1500, "Vinh");
		books[4] = new Book("1500", "mno", 2345, "Nhat");
		books[5] = new Book("2345", "pqr", 6789, "Loc");

		float total = 0;
		for (Book book : books) {
			total += book.getPrice();
		}
		System.out.println("Total book price: " + total);

		System.out.println("Books that have price over 1000:");
		for (Book book : books) {
			if (book.getPrice() > 1000) {
				System.out.print(book.getBookName() + "; ");
			}
		}
	}
}