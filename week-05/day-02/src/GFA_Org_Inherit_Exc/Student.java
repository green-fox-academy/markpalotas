package GFA_Org_Inherit_Exc;

public class Student extends Person {
    String previousOrganization = "The School of Life";
    int skippedDays = 0;

    public Student(String name, int age, Gender gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
    }
}
