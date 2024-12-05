import java.util.Scanner;

public class UniversityInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        System.out.println("Welcome to Chitecma University Information System");

        while (true) {
            System.out.println("\n1. Add Department");
            System.out.println("2. Add Professor");
            System.out.println("3. Add Student");
            System.out.println("4. List Department Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter department name: ");
                    String departmentName = scanner.nextLine();
                    university.addDepartment(departmentName);
                    break;
                case 2:
                    System.out.print("Enter department name: ");
                    departmentName = scanner.nextLine();
                    Department department = university.getDepartment(departmentName);
                    if (department != null) {
                        System.out.print("Enter professor name: ");
                        String professorName = scanner.nextLine();
                        department.addProfessor(professorName);
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter department name: ");
                    departmentName = scanner.nextLine();
                    department = university.getDepartment(departmentName);
                    if (department != null) {
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        System.out.print("Enter professor name (mentor): ");
                        String mentorName = scanner.nextLine();
                        department.addStudent(studentName, mentorName);
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;
                case 4:
                    university.listDepartments();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
