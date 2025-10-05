package Assignment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class EmployeeDetails {
    private int id;
    private String name;
    private double salary;
    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
class EmployeeSortDemo {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails(101, "Anil", 75000));
        employees.add(new EmployeeDetails(102, "Kiran", 50000));
        employees.add(new EmployeeDetails(103, "pavan", 82000));
        employees.add(new EmployeeDetails(104, "hari", 60000));
        System.out.println("Before sorting:");
        employees.forEach(System.out::println);
        employees.sort(Comparator.comparingDouble(EmployeeDetails::getSalary));
        System.out.println("\nAfter sorting by salary:");
        employees.forEach(System.out::println);
    }
}
