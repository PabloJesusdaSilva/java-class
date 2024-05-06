package challenges;

public class Data {

    int day;
    int month;
    int year;

    Data() {
        day = 1;
        month = 1;
        year = 2024;
    }

    Data (int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    String formatData () {
        return String.format("Is data: %d/%d/%d", day, month, year);
    }
}
