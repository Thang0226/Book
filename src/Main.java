public class Main {
	public static void main(String[] args) {
		Book[] books = new Book[6];
		books[0] = new Book("0123", "5 phuong trinh lam thay doi the gioi", 456, "Thang");
		books[1] = new Book("0456", "Sinh vao ngay xanh", 789, "Tri");
		books[2] = new Book("0789", "Ban mai tre", 1234, "Dung");
		books[3] = new Book("1234", "Cuoc chien lo den", 1500, "Vinh");
		books[4] = new Book("1500", "Mat ma", 2345, "Nhat");
		books[5] = new Book("2345", "Luoc su thoi gian", 6789, "Loc");

		calculateSumPrice(books);
		printPriceOver(books, 1200);
	}

	private static void printPriceOver(Book[] books, float price) {
		System.out.println("Books that have price over " + price + ":");
		for (Book book : books) {
			if (book.getPrice() > price) {
				System.out.println("\t" + book.getBookName());
			}
		}
	}

	private static void calculateSumPrice(Book[] books) {
		float total = 0;
		for (Book book : books) {
			total += book.getPrice();
		}
		System.out.println("Total book price: " + total);
	}
}