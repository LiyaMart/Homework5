public class Main {

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroupView view = new StudyGroupView();
        StudyGroupController controller = new StudyGroupController(studyGroupService, view, studyGroup);
        controller.runToDo();;
    }
}