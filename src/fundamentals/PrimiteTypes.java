package fundamentals;

public class PrimiteTypes {

    public static void main(String[] args) {
        // numeric Types
        byte companyDays = 23;
        short numberOfTrips = 542;
        int id = 56283;
        long accumulatedPoints = 3_134_845_223L;

        // real numeric types
        float wage = 11_445.44F;
        double accumulatedSales = 2_991_797.01;

        // boolean type
        boolean isOnVacation = false; // or true

        // char type
        char status = 'A'; // active


        // company days
        System.out.println(companyDays * 365);

        // numbers of trips
        System.out.println(numberOfTrips / 2);

        // wage
        System.out.println(id + ": wins -> " + wage);

        // accumulated sales
        System.out.println(accumulatedPoints / accumulatedSales);

        // is on vacation
        System.out.println("Vacation? " + isOnVacation);

        // active
        System.out.println("Status: " + status);
    }
}
