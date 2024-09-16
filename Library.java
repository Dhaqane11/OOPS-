import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Books> books = new ArrayList<>();
    private List<Books.Members> members = new ArrayList<>();


//    public Library() {
//
//    }

    public void addBook(Books book) {
        books.add(book);
    }


    public void registerMember(Books.Members member) {
        members.add(member);
    }


    public void lendBook(String isbn, String memberId) {
        Books book = findBookByIsbn(isbn);
        Books.Members member = findMemberById(memberId);

        if (book != null && member != null) {
            if (book.getCopiesAvailable() > 0) {
                member.borrowBook(book);
                book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                System.out.println("Book lent successfully.");
            } else {
                System.out.println("Sorry, no copies of the book are available.");
            }
        } else {
            if (book == null) {
                System.out.println("Book not found.");
            }
            if (member == null) {
                System.out.println("Member not found.");
            }
        }
    }

    // Private method to find a book by its ISBN
    private Books findBookByIsbn(String isbn) {
        for (Books book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Private method to find a member by their ID
    private Books.Members findMemberById(String memberId) {
        for (Books.Members member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
