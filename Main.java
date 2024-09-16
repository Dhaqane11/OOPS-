public class Main {
    public static void main(String[] args) {
        // buugata abuur
        Books book1 = new Books("javaScript Programming", "John Doe", "1234567890", 6);
        Books book2 = new Books("Data Structures", "Jane Smith", "0987654321", 2);

        // members abuurid
        Books.Members member1 = new Books.Members("Alice", "M001");
        Books.Members member2 = new Books.Members("Bob", "M002");

        // Create library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.registerMember(member1);
        library.registerMember(member2);

        // Lend books
        library.lendBook("1234567890", "M001"); // Should succeed
        library.lendBook("0987654321", "M002"); // Should succeed
        library.lendBook("0987654321", "M001"); // Should fail, not enough copies
    }
}
