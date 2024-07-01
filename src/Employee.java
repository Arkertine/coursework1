import java.util.Objects;

public class Employee {
    private static int count = 0;
    private  final int department;
    private final String name;
    private final double salary;
    private final int id;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public static int id(int i) {
        i++;
        return i;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public double  setSalary() {
        return this.salary;
    }
    public String toString() {
        System.out.println("ФИО: " + this.name + ". Номер отдела " + this.department + ". Зарплата: " + this.salary);
        return "";
    }
    public String printName() {
        System.out.println("ФИО: " + this.name);
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return name.equals(other.name) && department == (other.department) && salary == (other.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}

