public class Teacher {
    String name;
    String lastName;
    Student[] students;

    public Teacher(String name, String lastName, Student[] students) {
        this.name = name;
        this.lastName = lastName;
        this.students = students;
    }

    /**
     * 1 метод препода из задания. Реализовать метод, который выводит информацию о всех студентах
     * данного преподавателя согласно полям, придуманным в предыдущем задании.
     */
    public void getStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Имя студента: " + student.name + ", " + "Фамилия студента: " + student.lastName + ", " + "Номер зачётки: " + student.getRecordBook());
        }
    }

    /**
     * 2 метод препода из задания. Дополнительно реализовать метод, вызывающий метод(ы) студентов.
     */
    public void getStudentsMethods(Student[] students) {
        for (Student student : students) {
            student.getFacultyName(student.name, student.lastName);
            student.getCourse(student.name, student.lastName);
        }
    }
}

