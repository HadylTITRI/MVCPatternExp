package PatternsDesign.CompositePatternExp;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private float salary;
    private List<Employee> subordinates;

    Employee(String name, String dept, float salary){
        this.name = name;
        this.dept = dept;
        this.salary =salary;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee e){
        subordinates.add(e);
    }
    public void remove(Employee e){
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return  ("Employee : [Name : " + name +", departement:" + dept + ",salary :" + salary + "]");
    }

}
