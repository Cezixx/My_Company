package Application;
public class Main {
    public static void main(String[] args) {
        Company company = Methods.dataInit();

        //Wyświetlenie komunikatu powitalnego

        String title = ("Panel administracyjny firmy: " + company.getName());
        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));

        boolean done = false;
        while (!done) {
            System.out.println("Available options to choose from:");
            System.out.println("1. Show employees");
            System.out.println("2. Add employee");
            System.out.println("3. Remove employee");
            System.out.println("4. Update employees list");
            System.out.println("0. Exit");

            int choice = Methods.inputInt("Enter your choice: ");

            switch (choice) {
                // Wyświetlenie listy pracowników
                case 1:
                    Methods.printAnswer(company.getEmployees().toString());
                    break;
                // Zakończenie działania programu
                case 0:
                    Methods.printAnswer("Goodbye, see you soon!");
                    done = true;
                    break;
                // Dodanie nowego pracownika do listy pracowników
                case 2:
                    String name = Methods.inputString("Enter employee name: ");
                    String surname = Methods.inputString("Enter employee surname: ");
                    company.addEmployee(name, surname);
                    System.out.println("Added employee " + name + " " + surname);
                    System.out.println();
                    break;
                // Usuwanie pracownika z listy pracowników po wybraniu jego ID
                case 3:
                    int id = Methods.inputInt("Enter employee id: ");
                    company.removeEmployee(id);
                    System.out.println("Employee with id: " + id + " has been removed");
                    break;
                case 4:
                    company.updateListOfEmployees();
                    System.out.println("Employee list has been updated");
                    break;

                default:
                    Methods.printAnswer("Wrong choice try again!");
            }
        }
    }
}
