package oo.encapsulation;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String fullName() {
        return getName() + " " + getSurname();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        newAge = Math.abs(newAge);

        if(newAge >= 0 && newAge <= 120) {
            this.age = newAge;
        }
    }

    @Override
    public String toString() {
        return "Hello, my name is " + getName() + " and is my age " + getAge();
    }
}
