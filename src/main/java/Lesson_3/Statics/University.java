package Lesson_3.Statics;

public class University {

    private final String[] students = new String[30];

    public void addStudents(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null){
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University students = new University();
        students.addStudents("Максим Федоренко");
        students.addStudents("Олег Кесарчук");
        students.printStudents();
    }
}
