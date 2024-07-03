package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] muchLangs = { "Python ", "C++ ", "Go\n"};
        Stream.of(muchLangs).forEach(print);
        Arrays.stream(muchLangs).forEach(print);
        Arrays.stream(muchLangs, 1, 3).forEach(print);

        List<String> othersLangs = Arrays.asList("C ", "PHP ", "Kotlin ");
        othersLangs.stream().forEach(print);
        othersLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
