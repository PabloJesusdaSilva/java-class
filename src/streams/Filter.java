package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Karen", 9.3);
        Aluno a2 = new Aluno("Pablo", 9.6);
        Aluno a3 = new Aluno("Gustavo", 6.3);
        Aluno a4 = new Aluno("Gabriel", 8.2);
        Aluno a5 = new Aluno("Flavia", 8.9);
        Aluno a6 = new Aluno("Julia", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> approved = a -> a.note > 7;
        Function<Aluno, String> message = a -> "Parábens " + a.name + "! Você foi aprovado";

        alunos.stream()
                .filter(approved)
                .map(message)
                .forEach(System.out::println);
    }
}
