package oo.abstracts;

public abstract class Mamifero extends Animal{

    @Override
    public String toWalk() {
        return "Usando as patas";
    }

    public abstract String toMove();
}
