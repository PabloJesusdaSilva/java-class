package ooComposition.heranca;

public class Jogador {

    int x;
    int y;

    boolean andar(Direction direction) {
        switch (direction) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }

        return true;
    }
}
