package Firtst_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student extends  User_Portal {

    public Student(String name, int phone, String address, String designation, int id, int age) {
        super(name, phone, address, designation, id, age);
    }

    public void add_a_course(List<String> students_list_of_courses, String i){
      if(!students_list_of_courses.contains(i)){
          students_list_of_courses.add(i);
      }
    }

    @Override
    public String toString() {
        return "{" +
                "address='" + getAddress() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", phone=" + getPhone() +
                '}';
    }
}
