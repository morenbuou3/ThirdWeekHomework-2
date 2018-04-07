package practice08;

public class Teacher extends Person {

    private String s = super.introduce() + " I am a Teacher.";

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;

    }

    @Override
    public String introduce() {
        return klass == null ? s + " I teach No Class." : s + " I teach " + klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == this.klass.getNumber()
                ? s + " I teach " + student.getName() + "."
                : s + " I don't teach " + student.getName() + ".";
    }
}
