package lab3v13.tasks;

import lab3v13.model.StudentRecord;

public class ArrayObjectTask {
    public static void run() {
        System.out.println("\nЧастина D. Масив об'єктів");

        int variant = 13;
        int studentsCount = 7;
        int gradeBase = 82;

        StudentRecord[] students = new StudentRecord[studentsCount];

        for (int i = 0; i < students.length; i++) {
            String name = "Student_" + variant + "_" + i;
            int grade = gradeBase + (i % 5);

            students[i] = new StudentRecord(name, grade);
        }

        for (StudentRecord student : students) {
            System.out.println(student);
        }

        StudentRecord best = students[0];

        for (StudentRecord student : students) {
            if (student.getGrade() > best.getGrade()) {
                best = student;
            }
        }

        System.out.println("Найкращий студент: " + best);
    }
}