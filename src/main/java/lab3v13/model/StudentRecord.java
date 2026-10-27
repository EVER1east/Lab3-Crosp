package lab3v13.model;

public class StudentRecord {
    private String name;
    private int grade;

    public StudentRecord(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ", оцінка: " + grade;
    }
}