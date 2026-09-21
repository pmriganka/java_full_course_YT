
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.Stream;

class Student {


    private String name;
    private int age;
    
    public Student(String name) {
        this.name = name;
        //this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class ConstructorReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Paul", "John", "Jane");

        List<Student> students = new ArrayList<>();


        students = names.stream()
                     .map(Student::new)
                     .toList();

        System.out.println(students);

    }
}