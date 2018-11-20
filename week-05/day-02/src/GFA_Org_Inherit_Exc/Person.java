package GFA_Org_Inherit_Exc;

public class Person {
    String name = "Jane Doe";
    int age = 30;
    Gender gender = Gender.Female;

    public enum Gender {Female, Male}

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
