package classes;

public class CircuferemceAreaTest {

    public static void main(String[] args) {

        CircuferemceArea a1 = new CircuferemceArea(6.5);

        System.out.println(a1.area());

        CircuferemceArea a2 = new CircuferemceArea(10);

        System.out.println(a2.area());
        System.out.println(CircuferemceArea.area(400));
        System.out.println(CircuferemceArea.PI);
        System.out.println(Math.PI);
    }
}
