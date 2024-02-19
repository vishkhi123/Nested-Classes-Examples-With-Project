package project;

public class Test {
	
		 public static void main(String[] args) {
		        Library library = new Library();

		        // Adding books to the library
		        Book book1 = new Book("Java Programming", "John Doe");
		        Book book2 = new Book("Introduction to Algorithms", "Thomas H. Cormen");
		        library.addBook(book1);
		        library.addBook(book2);

		        // Adding members to the library
		        Member member1 = new Member("Alice", 1001);
		        Member member2 = new Member("Bob", 1002);
		        library.addMember(member1);
		        library.addMember(member2);

		        // Example of recording borrowing history
		        Library.BorrowingHistory history1 = library.new BorrowingHistory(book1, member1, "2024-02-19");
		        Library.BorrowingHistory history2 = library.new BorrowingHistory(book2, member2, "2024-02-20");

		        // Printing borrowing history
		        System.out.println("Borrowing History:");
		        System.out.println("Book: " + history1.getBook().getTitle() + ", Borrower: " + history1.getBorrower().getName() + ", Due Date: " + history1.getDueDate());
		        System.out.println("Book: " + history2.getBook().getTitle() + ", Borrower: " + history2.getBorrower().getName() + ", Due Date: " + history2.getDueDate());
		    }

}
