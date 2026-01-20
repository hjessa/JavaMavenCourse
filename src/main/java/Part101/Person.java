package Part101;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String name, String lastName, int birthYear) {
        this.firstName = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String toString() {
        return this.firstName +  this.lastName +" (" + this.birthYear + ")";
    }


}
