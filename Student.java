public class Student {
    private final String name;
    private final Professor mentor;

    public Student(String name, Professor mentor) {
        this.name = name;
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public Professor getMentor() {
        return mentor;
    }
}

