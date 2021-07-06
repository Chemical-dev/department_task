package Firtst_Task;

import java.util.ArrayList;
import java.util.List;

public class School1 {
    private Teacher teacher;
    private Principal principal;
    private Non_Teaching non_teaching_staff;
    private Student student;
    private List<String> courses;
    private Applicant applicant;
    private Courses school_courses;

    public School1() {
    }

    enum CLASSES {
        JSS1, JSS2, JSS3
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Non_Teaching getNon_teaching_staff() {
        return non_teaching_staff;
    }

    public void setNon_teaching_staff(Non_Teaching non_teaching_staff) {
        this.non_teaching_staff = non_teaching_staff;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Applicant getApplicant() {
        return applicant;
    }


    public Courses getSchool_courses() {
        return school_courses;
    }

    public void setSchool_courses(Courses school_courses) {
        this.school_courses = school_courses;
    }


    public School1(Teacher teacher, Principal principal, Non_Teaching non_teaching_staff, Student student, List<String> courses, Applicant applicant, Courses school_courses) {
        this.teacher = teacher;
        this.principal = principal;
        this.non_teaching_staff = non_teaching_staff;
        this.student = student;
        this.courses = courses;
        this.applicant = applicant;
        this.school_courses = school_courses;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }




        /*
        List<Student> student_detail = new ArrayList<>();
        List<String> school_course_list = new ArrayList<>();
        school_course_list.add("Geography");
        school_course_list.add("Chemistry");
        school_course_list.add("Biology");
        school_course_list.add("Geography");

        Courses courses = new Courses();
        Student student = new Student("Paloma", 000, "Greece", "Student", school_course_list);
        student.setStudents_courses(school_course_list);
        System.out.println(student_detail.size());
        student.setStudents_courses(school_course_list);
        System.out.println(student);
        System.out.println(school_course_list);
        Applicant applicant = new Applicant("John Doe", 000, "Golang heights", "applicant", 20);
        Staff staff = new Staff("Anthony", 7, "Golang heights",  "Principal", "Teacher",
                388);
        Teacher teacher = new Teacher("Graivy", 00, "london", "Chemistry Teacher");
        teacher.getName();
        Principal principal = new Principal("Yagi", 000, "Decagon", "Principal", student_detail);
        Non_Teaching non_teaching_staff = new Non_Teaching("gag", 000, "benin", "janitor");

        principal.admit_student(applicant, student_detail, courses);
        School1 app = new School1(teacher, principal, non_teaching_staff, student, school_course_list, applicant);
        System.out.println(app.getStudent());
        principal.expel_a_student(student, student_detail, courses);
        Map<String, Student> details= new HashMap<>();
        details.put("John", student);
        System.out.println(details.get(student));
    }*/



}