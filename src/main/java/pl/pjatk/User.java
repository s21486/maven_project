package pl.pjatk;

public class User {
    @Username(key = "Test me")

    private String name;
    @Userage
    private int age;
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
}
