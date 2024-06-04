package ooComposition.encapsulamento.casaB;

import ooComposition.encapsulamento.casaA.Ana;

public class Julia {

    Ana motherInLaw = new Ana();

    void test() {
        // System.out.println(motherInLaw.variableOne);
        // System.out.println(motherInLaw.variableTwo);
        // System.out.println(motherInLaw.variableThree);
        System.out.println(motherInLaw.variableFour);
    }
}
