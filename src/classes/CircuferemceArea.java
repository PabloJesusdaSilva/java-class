package classes;

public class CircuferemceArea {

   double radius;
   final static double PI = 3.14;

   CircuferemceArea(double initialRadius) {
       radius = initialRadius;
   }

    double area() {
       return PI * Math.pow(radius, 2);
    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
}
