package Application;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Methods {
    static int inputInt(String message) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość, wprowadź dane jeszcze raz");
            return inputInt(message);
        }
    }

    static String inputString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static void printAnswer(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    //Dodanie pracowników do listy firmy NetTech

    static Company dataInit() {
        Person firstPerson = new Person("Jan", "Kowalski");
        Employee firstEmployee = new Employee(firstPerson, Department.ADMINISTRATION);

        Person secondPerson = new Person("Pius", "Paschke");
        Employee secondEmployee = new Employee(secondPerson, Department.DIRECTORS);

        Person thirdPerson = new Person("Roman", "Dmowski");
        Employee thirdEmployee = new Employee(thirdPerson, Department.BACKEND);

        Person fourthPerson = new Person("Tymoteusz", "Puchacz");
        Employee fourthEmployee = new Employee(fourthPerson, Department.FRONTEND);

        Person fifthPerson = new Person("Kamil", "Stoch");
        Employee fifthEmployee = new Employee(fifthPerson, Department.CLOUD);

        Person sixthPerson = new Person("Jan", "Urban");
        Employee sixthEmployee = new Employee(sixthPerson, Department.SOFTWARE);

        Company company = new Company("NetTech");

        company.getEmployees().add(firstEmployee);
        company.getEmployees().add(secondEmployee);
        company.getEmployees().add(thirdEmployee);
        company.getEmployees().add(fourthEmployee);
        company.getEmployees().add(fifthEmployee);
        company.getEmployees().add(sixthEmployee);

        return company;
    }
}
