package classes;

public class User {

    String name;
    String email;

    public boolean equals(Object objeto) {
        if(objeto instanceof User) {
            User other = (User) objeto;

            boolean equalName = other.name.equals(this.name);
            boolean equalEmail = other.email.equals(this.email);

            return equalName && equalEmail;
        } else {
            return false;
        }
    }
}
