package fundamentals;

public class Ternary {

    public static void main(String[] args) {

        double media = 7.6;

        String recoveryResult = media >= 5 ? "Recuperação" : "Reprovado";
        String finalResult = media >= 7 ? "Aprovado!" : recoveryResult;

        System.out.println(finalResult);

        double note = 7.4;
        boolean bomComportamento = true;
        boolean passouPorMedia = note > 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        String result = temDesconto ? "Sim" : "Não";

        System.out.printf("Tem desconto %s", result);
    }
}
