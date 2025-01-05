package Application;

public class Employee extends Person {
    private Department department;

    public Employee(Person person, Department department) {
        super(person.getFirstName(), person.getSurname());
        this.department = department;
    }
    public Department getDepartment() { return department; }

    public void setDepartment(Department department) { this.department = department; }
}
