package challenges;

public class Logics {

    public static void main(String[] args) {

        boolean workOne = true;
        boolean workTwo = true;

        boolean buyTv52 = workOne && workTwo;
        boolean buyTv32 = workOne ^ workTwo;
        boolean boughtIceCream = workOne || workTwo;
        boolean notBoughtIceCream = boughtIceCream;

        System.out.println("bought the 50 TV");
        System.out.println("bought the 32 TV");
        System.out.println("bought ice cream");
        System.out.println("not bought ice cream");
    }
}
