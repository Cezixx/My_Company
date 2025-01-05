package Application;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private Address address;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.address = new Address("Warszawa", "Jagiellońska");
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name, String surname) {
        Person person = new Person(name, surname);
        Employee employee = new Employee(person, Department.ADMINISTRATION);

        

        employees.add(employee);
    }

    public void removeEmployee(int index) {
        System.out.println("List of employees before firing employee : " + employees);
        for (int i = 0; i < employees.size(); i++) {
        }
        employees.remove(index);
        System.out.println();
        System.out.println("List of employees after firing employee: " + employees);
        System.out.println();
    }

    public void updateListOfEmployees() {
        System.out.println("List of employees: " + employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Insert name for employee: ");
            String newName = scanner.nextLine();
            System.out.println("Insert surname for employee :");
            String newSurname = scanner.nextLine();
            employees.set(i, new Employee(new Person(newName, newSurname), Department.FRONTEND));
        }
        System.out.println("\n Updated list of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}