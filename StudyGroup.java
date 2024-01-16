import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    private String teacher;
    private List<String> students = new ArrayList<>();

    // Метод добавления студентов в список

    List<String> addStudent(String student){
        students.add(student);
        return students;
    }

    // Методы для получения данных

    public String getTeacher() {
        return teacher;
    }

    public List<String> getStudents() {
        return students;
    }  
}