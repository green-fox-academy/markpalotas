package TeacherStudent;

public class Student {
    String name;
    String year;
    int age;
    int knowledge = 0;

    public Student(String name, String year, int age) {
        this.name = name;
        this.year = year;
        this.age = age;
    }

    public void learn() {
        this.knowledge++;
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
