package practice08;

public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        StringBuilder s = new StringBuilder(super.introduce() + " I am a Student. I am ");
        return this.klass.getLeader() != null && this.klass.getLeader().getId() == getId() ?
                s.append("Leader of ").append(this.klass.getDisplayName()).append(".").toString():
                s.append("at ").append(this.klass.getDisplayName()).append(".").toString();
    }
}
