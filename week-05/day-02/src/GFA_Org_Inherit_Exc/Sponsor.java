package GFA_Org_Inherit_Exc;

public class Sponsor extends Person {
    private String company = "Google";
    private int hiredStudents = 0;

    public Sponsor(String name, int age, Gender gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor() {
    }

    public void hire() {
        hiredStudents++;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + ", who represents " + company + " and has hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
