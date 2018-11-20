package GFA_Org_Inherit_Exc;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> students = new ArrayList<>();
    private List<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void removeMentor(int index) {
        mentors.remove(index);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
