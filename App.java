class App {
    public static void main(String[] args) {

        Books book1 = new Books("Java Programming", "John Doe", "1234567890", 3);
        Books book2 = new Books("Data Structures", "Jane Smith", "0987654321", 3);

        book1.AvailableCopies();
        book2.AvailableCopies();


        Books.Members member = new Books.Members("Alice", "M001");



        member.borrowBook(book1);
        member.borrowBook(book2);


        book2.setCopiesAvailable(0);
        member.borrowBook(book2);

        book1.RemainingCopies();
        book2.RemainingCopies();

    }
}
