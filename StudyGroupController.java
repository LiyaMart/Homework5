import java.util.Scanner;

public class StudyGroupController {

    private StudyGroupService studyGroupService;
    private StudyGroupView view;
    private StudyGroup studyGroup;

    // Конструктор класса

    public StudyGroupController(StudyGroupService studyGroupService, StudyGroupView view, StudyGroup studyGroup) {
        this.studyGroupService = studyGroupService;
        this.view = view;
        this.studyGroup = studyGroup;
    }
    
    public void runToDo(){
        try (Scanner scanner = new Scanner(System.in)) {
            String teacher = view.getUserTeacher();
            boolean exit = true;
            while (exit) {
                String student = view.getUserStudent();
                studyGroup.addStudent(student);
                System.out.println("Для завершения ввода студентов введите 0, для продолжения введите 1");
                if (scanner.nextInt() == 0) {
                    exit = false;
                }
            }  
            studyGroupService.criateStudyGroup(teacher, studyGroup.getStudents());
            studyGroupService.printStudyGroup();
        }
    }
}