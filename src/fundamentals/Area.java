package fundamentals;

public class Area {

    public static void main(String[] args) {
         // to defineD a variable, we specify the type, create a name (coherent) and the value.
        double ray = 11;

        // to defineD a constant, we add the world "final" at the beginning os the constant;
        final double PI = 3.141519;

        double area = PI * ray * ray;

        System.out.println("Is area: " + area + " m2.");
    }
}
