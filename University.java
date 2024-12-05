import java.util.ArrayList;

public class University {
    private final ArrayList<Department> departments;

    public University() {
        departments = new ArrayList<>();
    }

    public void addDepartment(String name) {
        departments.add(new Department(name));
        System.out.println("Department added successfully!");
    }

    public Department getDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equalsIgnoreCase(name)) {
                return department;
            }
        }
        return null;
    }

    public void listDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            for (Department department : departments) {
                department.listDetails();
            }
        }
    }
}