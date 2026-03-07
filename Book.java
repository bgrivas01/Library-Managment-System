public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBoorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBoorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBoorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBoorrowed = borrowed;
    }

    public void borrowBook() {
        if (!isBoorrowed) {
            isBoorrowed = true;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }
}
