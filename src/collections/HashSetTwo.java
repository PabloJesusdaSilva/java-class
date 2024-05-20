package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTwo {

    public static void main(String[] args) {

        Set<String> firstList = new TreeSet<>();

        firstList.add("Fulano");
        firstList.add("Ciclano");
        firstList.add("Beltrano");

        for(String people: firstList) {
            System.out.println(people);
        }

        Set<Integer> listNumbers = new HashSet<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);

        for(Integer num: listNumbers) {
            System.out.println(num);
        }
    }
}
