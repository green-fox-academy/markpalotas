package Clonable;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, Person.Gender.male, "BME");
//        Student student2 = new Student();
//        student2 = student1.myClone("JohnTheClone");
//        Student student3 = new Student();
//        student3 = student1.myClone2("JohnTheClone");
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
        System.out.println(student1);
        System.out.println(student1.myClone("JohnTheClone"));
//        System.out.println(student1.myClone2("JohnTheClone"));
        System.out.println(student1);
    }
}
