
import java.util.HashMap;
import java.util.List;

public class StudyGroupService {

    private HashMap<String, List<String> > studyGroups = new HashMap<String, List<String>>();

    // Метод для создания учебной группы

    void criateStudyGroup(String teacher, List<String> students){
        studyGroups.put(teacher, students);
    }

    // Метод для печати учебной группы

    void printStudyGroup(){
        System.out.println("Преподаватель " + studyGroups.keySet() + " Список студектов " + studyGroups.values());
    }
}
