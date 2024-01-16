import java.util.Scanner;

public class StudyGroupView {

    private Scanner scanner = new Scanner(System.in);

    // Методы для получения данных из консоли

    public String getUserTeacher() {
        System.out.println("Введите ФИО преподавателя");
        return scanner.nextLine();
    }

    public String getUserStudent(){
        System.out.println("Введите ФИО студента");
        return scanner.nextLine();
    }
}