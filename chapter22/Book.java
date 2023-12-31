package chapter22;

public class Book {
    private String title;
    private String author;

    Book() {
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showBook() {
        System.out.println("title: " + this.getTitle() + " / author: " + this.getAuthor());
    }
}
