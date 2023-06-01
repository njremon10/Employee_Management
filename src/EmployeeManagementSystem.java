import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void removeEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
