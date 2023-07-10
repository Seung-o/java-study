package chapter22;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥 1", "조정래");
        library[1] = new Book("태백산맥 2", "조정래");
        library[2] = new Book("태백산맥 3", "조정래");
        library[3] = new Book("태백산맥 4", "조정래");
        library[4] = new Book("태백산맥 5", "조정래");

        for (Book book : library) {
            book.showBook();
        }
    }
}
