package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Fulano"); // lança uma excessão
        queue.offer("Beltrano"); // retorna falso
        queue.add("Karen");
        queue.offer("Pablo");

        System.out.println(queue.peek()); // retorna false
        System.out.println(queue.element()); // lança uma excessãp

        queue.size();
        queue.clear();
        queue.isEmpty();

        System.out.println(queue.poll()); // retorna false
        System.out.println(queue.remove()); // lança uma excessãp
    }
}
