import java.util.ArrayList;
import java.util.List;

public class University {

    public static void main(String[] args) {
        //Здесь добавляем по условию задания первому преподу Иванову по 3 студента
        Student[] ivanovGroup = new Student[3];
        ivanovGroup[0] = new Student("Vasya", "Vakulenko", 12345678);
        ivanovGroup[1] = new Student("Pavel", "Pavlov", 1551111111);
        ivanovGroup[2] = new Student("Oksana", "Klimova", 1111113211);

        ////Здесь добавляем по условию задания второму преподу Петрову по 3 студента
        Student[] petrovGroup = new Student[3];
        petrovGroup[0] = new Student("Vasilisa", "Vakulenkova", 12300000);
        petrovGroup[1] = new Student("Elena", "Pavlova", 112222231);
        petrovGroup[2] = new Student("Maria", "Klimovec", 11119999);

        //Здесь добавляем по условию задания третьему преподу Поповой по 3 студента
        Student[] popovaGroup = new Student[3];
        popovaGroup[0] = new Student("Nikolay", "Nikolaev", 12345678);
        popovaGroup[1] = new Student("Antonina", "Pavlova", 11111215);
        popovaGroup[2] = new Student("Anton", "Klimov", 22221111);


        //Создаем объекты преподов
        Teacher ivanov = new Teacher("Ivan", "Ivanov", ivanovGroup);
        Teacher petrov = new Teacher("Alex", "Petrov", petrovGroup);
        Teacher popova = new Teacher("Anna", "Popova", popovaGroup);

        //добавление преподов в университет
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ivanov);
        teacherList.add(petrov);
        teacherList.add(popova);

        //вызоваем методы преподов из класса Teacher
        for (Teacher teacher : teacherList) {
            teacher.getStudents(teacher.students);
            teacher.getStudentsMethods(teacher.students);
        }
    }
}

