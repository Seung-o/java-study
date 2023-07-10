package chapter22;

public class ObjectDeepCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체의 주소값 배열을 메모리에 할당함
        Book[] copiedLibrary = new Book[5];

        library[0] = new Book("태백산맥 1", "조정래");
        library[1] = new Book("태백산맥 2", "조정래");
        library[2] = new Book("태백산맥 3", "조정래");
        library[3] = new Book("태백산맥 4", "조정래");
        library[4] = new Book("태백산맥 5", "조정래");

        for (int i = 0; i < library.length; i++) {
            copiedLibrary[i] = new Book();
            copiedLibrary[i].setAuthor(library[i].getAuthor());
            copiedLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("Library");
        for (Book book : library) {
            book.showBook();
        }

        System.out.println("===================");

        System.out.println("CopiedLibrary");
        for (Book book : copiedLibrary) {
            book.showBook();
        }
    }
}
