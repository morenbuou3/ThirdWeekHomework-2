package practice11;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {

    private String s = super.introduce() + " I am a Teacher.";
    private Set<Klass> classes = new HashSet<>();

    public Set<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass aClass : classes) {
            aClass.setTeacher(this);
        }
    }

    private String getDisplayClasses() {
        StringBuilder result = new StringBuilder(" I teach Class ");
        if (classes.size() == 0) {
            return " I teach No Class.";
        } else {
            for (Klass aClass : classes) {
                result.append(aClass.getNumber()).append(", ");
            }
        }
        return result.delete(result.length() - 2, result.length()).append(".").toString();
    }

    @Override
    public String introduce() {
        return this.s + getDisplayClasses();
    }

    public String introduceWith(Student student) {
        return isTeaching(student)
                ? s + " I teach " + student.getName() + "."
                : s + " I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        boolean flag = false;
        for (Klass aClass : classes) {
            if (aClass.isIn(student)) {
                flag = true;
            }
        }
        return flag;
    }

    public String introduceAppendMember(Student student, Klass klass) {
        return "I am " + super.getName()
                + ". I know " + student.getName() + " has joined Class "
                + klass.getNumber() + ".\n";
    }

    public String introduceAssignLeader(Student student, Klass klass) {
        return "I am " + super.getName()
                + ". I know " + student.getName() + " become Leader of Class "
                + klass.getNumber() + ".\n";
    }

}
