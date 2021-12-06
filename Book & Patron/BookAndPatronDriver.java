public class BookAndPatronDriver {
    public static void main(String[] args) {
        Patron mike = new Patron("mike");
        System.out.println(mike); // Testing toString (expected: has borrowed no books.)
        Book computer_science = new Book("Computer Science", "Mr. Barber");
        Book english = new Book("English", "Mrs. Johnson");
        Book world_history = new Book("World History", "Mrs. Stoltz");
        System.out.println(computer_science); // Testing toString (expected: name and author of book)
        mike.borrowBook(computer_science);
        System.out.println(mike);  // Testing toString (expected: has borrowed computer science book.)
        mike.borrowBook(computer_science); // Testing borowing twice (expected: has borrowed this book already)
        System.out.println(mike); // Testing toString (expected: has borrowed computer science book.)

        mike.borrowBook(english);
        mike.borrowBook(world_history);

        System.out.println(mike); // Testing toString (expected: has borrowed computer science, english, and world history books.)

        Book chemistry = new Book("Chemistry", "Mr. Atya");
        mike.borrowBook(chemistry); // Testing borrowing more than 1 book (expected: has 3 books borrowed already.)
        

    }
}