
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OptionalClass {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Paul", "John", "Jane");

        // Optional is used to avoid NullPointerException
        Optional<String> name = names.stream()
                           .filter(str -> str.equals("xx"))
                           .findFirst();
                           

        System.out.println(name.orElse("Not found"));

    }
}