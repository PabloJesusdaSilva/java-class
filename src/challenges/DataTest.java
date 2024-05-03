package challenges;

public class DataTest {

    public static void main(String[] args) {

        Data data = new Data();
        data.day = 10;
        data.month = 11;
        data.year = 2024;

        System.out.printf("Is data: %d/%d/%d", data.year, data.month, data.day);

        Data twoData = new Data();
        twoData.day = 27;
        twoData.month = 4;
        twoData.year = 2018;

        System.out.printf("\nIs data: %d/%d/%d", twoData.year, twoData.month, twoData.day);
    }
}
