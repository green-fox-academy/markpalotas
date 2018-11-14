package TeacherStudent;

public class Teacher {
    String name;
    String subject;
    int age;
    int energy = 100;

    public Teacher(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public void answer() {
        this.energy--;
    }

    public void teach(Student student) {
        student.learn();
    }
}
