package fundamentals;

public class TemperatureConversion {

    public static void main(String[] args) {
        // is formule: (ºF -32) x 5/9 = ºC

        final int adjustment = 32;
        final double factor = 5.0 / 9.0;

        double fahrenheit = 86;
        double conversationCelsius = (fahrenheit - adjustment) * factor;

        System.out.println("Fahrenheit to Celsius conversation is: " + conversationCelsius + "ºc.");
    }
}
