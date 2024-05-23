package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Pablo");
        users.put(2, "Karen");
        users.put(3, "Daiane");
        users.put(4, "Tom");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("Pablo"));

        System.out.println(users.get(2));

        for(Integer key: users.keySet()) {
            System.out.println(key);
        }

        for(String value: users.values()) {
            System.out.println(value);
        }

        for(Entry<Integer, String> register: users.entrySet()) {
            System.out.println(register.getKey() + "");
            System.out.println(register.getValue());
        }
    }
}
