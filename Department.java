import java.util.ArrayList;

public class Department {
    private final String name;
    private final ArrayList<Professor> professors;
    private final ArrayList<Student> students;

    public Department(String name) {
        this.name = name;
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(String name) {
        professors.add(new Professor(name));
        System.out.println("Professor added successfully!");
    }

    public void addStudent(String name, String professorName) {
        Professor professor = findProfessor(professorName);
        if (professor != null) {
            students.add(new Student(name, professor));
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Professor not found!");
        }
    }

    public void listDetails() {
        System.out.println("Department: " + name);
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.getName());
        }
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getName() + " (Mentor: " + student.getMentor().getName() + ")");
        }
    }

    private Professor findProfessor(String name) {
        for (Professor professor : professors) {
            if (professor.getName().equalsIgnoreCase(name)) {
                return professor;
            }
        }
        return null;
    }
}

