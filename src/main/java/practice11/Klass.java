package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public boolean isIn(Student student) {
        return student.getKlass().getNumber() == this.number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            if (teacher != null) {
                System.out.print(this.teacher.introduceAssignLeader(student, this));
            }
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (teacher != null) {
            System.out.print(this.teacher.introduceAppendMember(student, this));
        }
    }

}
