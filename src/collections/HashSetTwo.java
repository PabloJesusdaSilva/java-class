package collections;

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
    }
}
