package chapter29;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백 산맥1");
        bookQueue.enQueue("태백 산맥2");
        bookQueue.enQueue("태백 산맥3");

        int size = bookQueue.getSize();
        System.out.println("size: " + size);

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
