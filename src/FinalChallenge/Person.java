package FinalChallenge;

public class Person {

    String personName;
    double personWeight;

    Person(String personName, double personWeight) {
        this.personName = personName;
        this.personWeight = personWeight;
    }

    void eat(Food food) {
        if(food != null) {
            this.personWeight += food.foodWeight;
        }
    }

    String present() {
        return "Hello, my name is " + personName + " and weight is " + personWeight + ".";
    }
}
