package TeacherStudent;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("john Doe", "maths", 33);
        Teacher teacher2 = new Teacher("Jane Doe", "geography", 39);
        Student student1 = new Student("Johnny Doe", "2017", 16);
        Student student2 = new Student("Jenny Doe", "2018", 14);

        student1.learn();
        student1.learn();
        System.out.println(student1.knowledge);
        student2.learn();
        System.out.println(student2.knowledge);
        teacher1.answer();
        teacher1.answer();
        System.out.println(teacher1.energy);
        teacher2.answer();
        System.out.println(teacher2.energy);
        student1.question(teacher1);
        student2.question(teacher1);
        System.out.println(teacher1.energy);
        teacher1.teach(student1);
        teacher2.teach(student1);
        System.out.println(student1.knowledge);
    }
}
