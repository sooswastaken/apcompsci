public class Patron {
    private String name;
    private Book book_one;
    private Book book_two;
    private Book book_three;

    public Patron(String name_) {
        name = name_;
    }

    private boolean hasBorrowed(Book book) {

        if (book_one != null) {
            if (book_one.equals(book)) {
                return true;
            }
        }
        if (book_two != null) {
            if (book_two.equals(book)) {
                return true;
            }
        }
        if (book_three != null) {
            if (book_three.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if(!hasBorrowed(book)) {
            System.out.println(name + "has not borrowed the following book: " + book);
            return false;
        }
        
        if(book_one != null) {
            book_one = null;
            return true;
        }
        if(book_two != null) {
            book_two = null;
            return true;
        }
        if(book_three != null) {
            book_three = null;
            return true;
        } else return false; // Unneeded, all cases already matched.
    }
    
    public boolean borrowBook(Book book) {
        if(hasBorrowed(book)) {
            System.out.println(name + " has borrowed this book already.");
            return false;
        }
        if(book_one == null) {
            book_one = new Book(book.getTitle(), book.getAuthor());
            return true;
        }
        if(book_two == null) {
            book_two = new Book(book.getTitle(), book.getAuthor());
            return true;
        }
        if(book_three == null) {
            book_three = new Book(book.getTitle(), book.getAuthor());
            return true;
        }
        System.out.println(name + " has 3 books borrowed already.");
        return false;
    }

    public String toString() {
        if ((book_one == null) && (book_two == null) && (book_three == null)) {
            return name + " has borrowed no books.";
        } else {
            String temp = name + " has the following books: ";
            if (book_one != null) {
                temp = temp + book_one.toString() + ", ";
            }
            if (book_two != null) {
                temp = temp + book_two.toString() + ", ";
            }
            if (book_three != null) {
                temp = temp + book_three.toString() + ", ";
            }
            temp = temp.substring(0, temp.length() - 2) + ".";
            return temp;
        }
    }
}