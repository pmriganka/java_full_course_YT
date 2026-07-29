class Human
{
    private String name;
    private int age;

    // By Default Java creates a constructor with no arguments
    // But if we create a constructor with arguments, Java will not create the default constructor
    // So we need to create the default constructor manually

    public Human() {
        System.out.println("Default constructor called");
        this.name = "Mriganka";
        this.age = 30;
    }

    public Human(int a, String n) {
        System.out.println("Parameterized constructor called");
        this.name = n;
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Constructor_Demo
{
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.getName());
        System.out.println(h.getAge());

        h.setName("John");
        h.setAge(25);
        
        System.out.println(h.getName());
        System.out.println(h.getAge());

        Human h2 = new Human(30, "Jane");
        System.out.println(h2.getName());
        System.out.println(h2.getAge());

    }
}
