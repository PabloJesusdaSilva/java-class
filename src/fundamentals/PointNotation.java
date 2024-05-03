package fundamentals;

public class PointNotation {

    public static void main(String[] args) {

        String name = "Pablo";

        name = name
                .replace("Pablo", "Karen");

        name = name
                .toUpperCase();

        name = name
                .concat("!!!");

        String frase = "Good Morning Y";

        frase = frase
                .replace("Y", "Pablo")
                .toUpperCase()
                .concat("!!!");

        System.out.println(name);
        System.out.println(frase);
    }
}
