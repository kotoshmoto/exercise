public class Student {
    String name;
    String lastName;
    private int recordBook;

    public Student(String name, String lastName, int passportData) {
        this.name = name;
        this.lastName = lastName;
        this.recordBook = passportData;
    }

    //геттер номера зачетки
    public int getRecordBook() {
        return recordBook;
    }

    /**
     * сеттер номера зачётки (можно дописать например у препода метод
     * public void setRecordBookNumber(Student student) {
     * student.setRecordBook(1234666655);
     * }
     * <p>
     * а в main классе вызвать
     * ivanov.setRecordBookNumber(ivanovGroup[0]);
     */
    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }

    //метод студента 1
    public void getFacultyName(String name, String lastName) {
        System.out.println(name + " " + lastName + " - студент Психологического факультета");
    }

    //метод студента 2
    public void getCourse(String name, String lastName) {
        System.out.println(name + " " + lastName + " - студент 1го курса");
    }
}
