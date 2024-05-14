package challenges;

public class Data {

    public int day;
    public int month;
    public int year;

    public Data() { this(1, 1, 1970); }

    public Data (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String formatData () {
        final String formatString = "Is data: %d/%d/%d";

        return String.format(formatString, this.day, month, year);
    }
}
