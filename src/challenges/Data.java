package challenges;

public class Data {

    public int day;
    public int month;
    public int year;

    Data() {
        day = 1;
        month = 1;
        year = 2024;
    }

    public  Data (int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    public String formatData () {
        return String.format("Is data: %d/%d/%d", day, month, year);
    }
}
