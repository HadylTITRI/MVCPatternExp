package pack;

public class MVCPatterDemo {
    public static void main(String args[]){
        ModelStudent model = retriveSudentFromDatabase();
        ViewStudent view = new ViewStudent();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Lyna");

        controller.updateView();
    }

    private static ModelStudent retriveSudentFromDatabase() {
        ModelStudent student = new ModelStudent();
        student.setName("Hadyl");
        student.setRollNo("15");
        return student;
    }
}
