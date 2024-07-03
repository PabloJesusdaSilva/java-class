package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintedObject {

    public static void main(String[] args) {

        List<String> approveds = Arrays.asList("Pietro", "Karen", "Sofia", "Pablo", "Gabriel", "Julia");

        // ForEach
        for(String name: approveds) {
            System.out.println("Is name: " + name);
        }

        // Iterator
        Iterator<String> iterator = approveds.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Stream
        Stream<String> stream = approveds.stream();
        stream.forEach(System.out::println);
    }
}
