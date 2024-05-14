package challenges;

public class Data {

    public int day;
    public int month;
    public int year;

    Data() {
        this(1, 1, 1970);
    }

    public  Data (int day, int initialMonth, int initialYear) {
        this.day = day;
        month = initialMonth;
        year = initialYear;
    }

    public String formatData () {
        final String formatString = "Is data: %d/%d/%d";

        return String.format(formatString, this.day, month, year);
    }
}
