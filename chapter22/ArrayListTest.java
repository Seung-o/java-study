package chapter22;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList();
        list.add(new Book("태백산맥 1", "조정래"));
        list.add(new Book("태백산맥 2", "조정래"));
        list.add(new Book("태백산맥 3", "조정래"));
        list.add(new Book("태백산맥 4", "조정래"));
        list.add(new Book("태백산맥 5", "조정래"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).showBook();
        }
    }
}
