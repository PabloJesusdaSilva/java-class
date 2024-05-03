package challenges;

public class Arithmetic {

    public static void main(String[] args) {
        //
        double firstOperationA =  6 * (3 + 2);
        double secondOperationA = Math.pow(firstOperationA, 2);
        double thirdOperationA = 3 * 2;
        double resultA = secondOperationA / thirdOperationA;

        System.out.println(resultA);

        double firstOperatioB = (1 - 5) * (2 - 7);
        double secondOperationB = firstOperatioB / 2;
        double resultB = Math.pow(secondOperationB, 2);
        System.out.println(resultB);

        double firstOperactionC = resultA - resultB;
        double secondOperationC = Math.pow(firstOperactionC, 3);
        double thirdOperationC = Math.pow(10, 3);

        double finalResult = secondOperationC / thirdOperationC;

        System.out.println(finalResult);
    }
}
