import java.util.ArrayList;
import java.util.List;

public class Books {
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Books(String title, String author, String isbn, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCopiesAvailable(int copies) {
        this.copiesAvailable = copies;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public static class Members {
        public String name;
        private String memberId;
        private List<Books> borrowedBooks = new ArrayList<>();

        public Members(String name, String memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        public String getMemberId() {
            return memberId;
        }

        public void borrowBook(Books book) {
            if (book.getCopiesAvailable() > 0) {
                borrowedBooks.add(book);
                book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                System.out.println("You have successfully borrowed the book: " + book.title);
            } else {
                System.out.println("Sorry, no copies of " + book.title + " are available.");
            }
        }
    }

    public void AvailableCopies () {
       System.out.println(title + " Available Copies: " +  getCopiesAvailable());
     }

     public void RemainingCopies(){
         System.out.println("Remaining Copies of " + title + ": " + getCopiesAvailable());

     }
}
