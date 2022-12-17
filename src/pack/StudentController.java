package pack;

import pack.ModelStudent;

public class StudentController {
    private ModelStudent model;
    private ViewStudent view;

    public StudentController(ModelStudent model, ViewStudent view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }

    public void setRolleNo (String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
