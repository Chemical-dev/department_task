package Firtst_Task;

import java.util.List;

public class Teacher extends User_Portal{
    private List<String> list_of_courses_taught;

    public Teacher(String name, int phone, String address, String designation, int id, int age, List<String> list_of_courses_taught) {
        super(name, phone, address, designation, id, age);
        this.list_of_courses_taught = list_of_courses_taught;
    }

    public List<String> getList_of_courses_taught() {
        return list_of_courses_taught;
    }

    public void setList_of_courses_taught(List<String> list_of_courses_taught) {
        this.list_of_courses_taught = list_of_courses_taught;
    }

    public void teach_a_course(Teacher teacher, String course){
        if(!list_of_courses_taught.contains(course))
    list_of_courses_taught.add(course);

    }
}
