package getter_and_setter;

public class Main
{
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    private String name;
   protected int age;
   private String origin;

}
