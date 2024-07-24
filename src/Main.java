public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        employees[1] = new Employee("Иванаев Игнатий Иванович", 1, 42000);
        employees[2] = new Employee("Иваненков Игорь Иванович", 2, 50000);
        employees[3] = new Employee("Иванилов Илья Иванович", 2, 52000);
        employees[4] = new Employee("Иванихин Иннокентий Иванович", 3, 56000);
        employees[5] = new Employee("Иванишин Исаак Иванович", 3, 54000);
        employees[6] = new Employee("Иванищев Иоанн Иванович", 4, 42000);
        employees[7] = new Employee("Иванченко Илларион Иванович", 4, 46000);
        employees[8] = new Employee("Иваньев Ильяс Иванович", 5, 58000);
        employees[9] = new Employee("Ивановский Иосиф Иванович", 5, 57500);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("id-" + (i + 1) + " ");
            System.out.println(employees[i]);
        }

        double result = calculateTotalSalary(employees);
        System.out.println("-Общая сумма затрат на заработную плату: " + result + "\n");
        System.out.println("-Минимальная заработная плата сотрудника.\n " + calculateMinSalary(employees));
        System.out.println("-Максимальная заработная плата сотрудника.\n " + calculateMaxSalary(employees));
        System.out.println("-Средняя заработная плата сотрудника: " + calculateAverageSalary(employees) + "\n");
        System.out.println("ФИО сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public static Employee calculateMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee calculateMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double calculateAverageSalary = 0;
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                calculateAverageSalary += employees[i].getSalary();
                k++;
            }
        }
        return calculateAverageSalary / k;
    }
}
