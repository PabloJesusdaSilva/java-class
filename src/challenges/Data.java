package challenges;

public class Data {

    int day;
    int month;
    int year;

    String formatData () {
        return String.format("Is data: %d/%d/%d", year, month, day);
    }
}
