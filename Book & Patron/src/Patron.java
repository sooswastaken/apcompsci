public class Patron {
    private String name;
    private Book book_one;
    private Book book_two;
    private Book book_three;

    public Patron(String name_) {
        name = name_;
    }

    private boolean has_borrowed(Book book) {
        boolean hasBorrowed = false;
        if(book_one != null) {
            hasBorrowed = book.equals(book_one);
        }
        if(book_two != null) {
            hasBorrowed = book.equals(book_two);
        }
        if(book_three != null) {
            hasBorrowed = book.equals(book_three);
        }
        return hasBorrowed;
    }

    public void return_book(Book book) {
        if(has_borrowed(book)){
            if(book_one.equals(book)) {
                book_one = null;
            }
            if(book_two.equals(book)) {
                book_two = null;
            }
            if(book_three.equals(book)) {
                book_three = null;
            }
        }
    }

    public void borrow_book(Book book) {
        if(book_one.equals(book) || book_two.equals(book) || book_three.equals(book)) {
            System.out.println("Book has already been borrowed");
        }
        else if(book_one != null) {

        }
    }


    public String toString() {
        String books = "";
        if(book_one != null) {
            books += book_one;
        }
        return "Patron: " + name + "Books: ";
    }

}