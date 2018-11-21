package Clonable2;

public class Student extends Person implements Cloneable {
    private String previousOrganization = "The School of Life";
    private int skippedDays = 0;

    public Student(String name, int age, Gender gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganization + ", who has skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student clonedStudent;
        clonedStudent = ((Student) super.clone());
        clonedStudent.setName("JohnTheClone");
        return clonedStudent;
    }

    @Override
    public String toString() {
        return super.toString() + " " + previousOrganization;
    }
}
