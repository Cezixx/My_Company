package Application;

public class Person {
    private String firstName;
    private String surname;
    private Address address;

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() { return surname; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String city, String street) {
        this.address = new Address(city, street);
    }

    @Override
    public String toString() {
        return firstName + " " + surname;
    }


}
