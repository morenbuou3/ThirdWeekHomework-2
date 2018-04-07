package practice01;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        StringBuffer s = new StringBuffer();
        s.append("My name is ").append(this.name).append(". I am ").append(age).append(" years old.");
        return s.toString();
    }
}
