package Clonable2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, Person.Gender.male, "BME");
        System.out.println(student1);
        try {
            System.out.println(student1.clone());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
