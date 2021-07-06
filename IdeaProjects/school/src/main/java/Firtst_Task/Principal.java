package Firtst_Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Principal extends User_Portal {
    Map<String, String> student_details;

    public Principal(String name, int phone, String address, String designation, int id, int age, Map<String, String> student_details) {
        super(name, phone, address, designation, id, age);
        this.student_details = student_details;
    }

    public Map<String, String> getStudent_details() {
        return student_details;
    }

    public void setStudent_details(Map<String, String> student_details) {
        this.student_details = student_details;
    }

    public void admit_a_student(Applicant applicant, List<Student> studentList){
        if(applicant.getAge() < 12){
        List<String> student_courses = new ArrayList();
            studentList.add(new Student(applicant.getName(), applicant.getPhone(), applicant.getAddress(), applicant.getDesignation(), applicant.getId(), applicant.getAge()));
        }
    }
    public void expel_a_student(Student student, List<Student> studentList){
        studentList.remove(new Student(student.getName(), student.getPhone(), student.getAddress(), student.getDesignation(), student.getId(), student.getAge()));


    }

}


