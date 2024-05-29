package ooComposition.heranca;

public class Jogo {

    public static void main(String[] args) {

        Heroi heroi = new Heroi(10, 11);

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println("Heroi tem " + heroi.vida + " vidas");
        System.out.println("Monstro tem " + monstro.vida + " vidas");

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        monstro.andar(Direction.NORTE);
        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem " + heroi.vida + " vidas");
        System.out.println("Monstro tem " + monstro.vida + " vidas");
    }
}
