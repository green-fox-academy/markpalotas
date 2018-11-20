package GFA_Org_Inherit_Exc;

public class Mentor extends Person {
    private Level level = Level.intermediate;

    public enum Level {junior, intermediate, senior}

    public Mentor(String name, int age, Gender gender, Level level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " " + level + " mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
}
