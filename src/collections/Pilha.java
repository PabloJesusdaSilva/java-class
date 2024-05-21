package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<>();

        books.add("O pequeno principe");
        books.push("Don Quixote");
        books.push("O Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        for(String book: books) {
            System.out.println(book);
        }

        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());

        System.out.println(books.pop());

        // books.size();
        // books.clear();
        // books.contains();
        // books.isEmpty();
    }
}
