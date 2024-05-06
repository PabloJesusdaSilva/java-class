package challenges;

public class DataTest {

    public static void main(String[] args) {

        Data data = new Data();
        Data twoData = new Data(3, 11, 2024);

        System.out.println(data.formatData());
        System.out.println(twoData.formatData());
    }
}
