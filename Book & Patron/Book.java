public class Book {
    private String title;
    private String author;

    public Book(String title_, String author_) {
        title = title_;
        author = author_;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public boolean equals(Object book) {
        Book temp = (Book)book;
        return (temp.getTitle() == title && temp.getAuthor() == author);
    }

    public String toString() {
        return "Title: " + title + " Author: " + author;
    }
}