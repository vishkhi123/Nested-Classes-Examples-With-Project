package project;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    // Inner class to represent borrowing history of a book
    public class BorrowingHistory {
        private Book book;
        private Member borrower;
        private String dueDate;

        public BorrowingHistory(Book book, Member borrower, String dueDate) {
            this.book = book;
            this.borrower = borrower;
            this.dueDate = dueDate;
        }
     // Getters and setters

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public Member getBorrower() {
			return borrower;
		}

		public void setBorrower(Member borrower) {
			this.borrower = borrower;
		}

		public String getDueDate() {
			return dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

        
        
    }


}
