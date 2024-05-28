package ooComposition.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;

        j1.andar(Direction.NORTE);
        j1.andar(Direction.LESTE);
        j1.andar(Direction.NORTE);
        j1.andar(Direction.LESTE);

        System.out.println(j1.x);
        System.out.println(j1.y);
    }
}
