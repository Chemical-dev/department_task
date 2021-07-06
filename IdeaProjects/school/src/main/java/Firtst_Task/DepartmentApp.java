package Firtst_Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentApp {
    public static void main(String[] args){
        School1 school1 = new School1();

        List<String> students_list_of_courses = new ArrayList<>();

        List<String> list_of_courses_taught = new ArrayList<>();
        Map<String, String> students_detail = new HashMap<>();
       List<Student> studentList = new ArrayList<>();
        List<String> students_courses = new ArrayList<>();
        students_courses.add("Goegraphy");
        Student student = new Student("Drogo", 00, "great", "student", 123, 12);
Non_Teaching non_teaching = new Non_Teaching("Groovy", 00, "Decagon", "Potter", 001, 32);
//String name = "Monday";
Applicant Monday = new Applicant("Monday", 00, "Golang heights", "Applicant", 001, 16);
Applicant Monday1 = new Applicant("Monday1", 00, "ihvucyf", "Applicant", 001, 3);
Applicant Monday2 = new Applicant("Monday2", 00, "ftx8rciyuovhb", "Applicant", 001, 2);
Applicant Monday3 = new Applicant("Monday3", 00, "fx8dz7se", "Applicant", 001, 3);
Teacher teacher = new Teacher("Musa", 00, "Benin", "Chemistry teacher", 011, 32, list_of_courses_taught);
Principal principal = new Principal("Goodluck", 888, "Decagon", "Principal", 11, 28, students_detail);
principal.admit_a_student(Monday, studentList);
principal.admit_a_student(Monday1, studentList);
principal.admit_a_student(Monday2, studentList);
principal.admit_a_student(Monday3, studentList);


//principal.expel_a_student(Monday2, studentList);
        System.out.println(school1.getTeacher());
        System.out.println(studentList.size());
        System.out.println(studentList);
        studentList.add(student);
        System.out.println(studentList);
        principal.expel_a_student(student, studentList);
        System.out.println(studentList);
        student.add_a_course(students_list_of_courses, "Geography");
        System.out.println(students_list_of_courses);

teacher.teach_a_course(teacher, "Chemistry");
        System.out.println(teacher.getList_of_courses_taught());

        System.out.println(studentList);
    }
}
