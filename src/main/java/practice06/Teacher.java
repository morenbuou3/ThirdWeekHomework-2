package practice06;

public class Teacher extends Person {

    private Integer klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        StringBuilder s = new StringBuilder(super.introduce() + " I am a Teacher. I teach");
        return klass == null ? s.append(" No Class.").toString() : s.append(" Class ").append(this.klass).append(".").toString();
    }
}