package Firtst_Task;

public class Staff {
   private Principal principal;
   private Teacher teacher;
   private Non_Teaching non_teaching;

    public Staff(Principal principal, Teacher teacher, Non_Teaching non_teaching) {
        this.principal = principal;
        this.teacher = teacher;
        this.non_teaching = non_teaching;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Non_Teaching getNon_teaching() {
        return non_teaching;
    }

    public void setNon_teaching(Non_Teaching non_teaching) {
        this.non_teaching = non_teaching;
    }
}
