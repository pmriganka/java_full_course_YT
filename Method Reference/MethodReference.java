
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class MethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Paul", "John", "Jane");

        List<String> n = names.stream()
                              .map(String::toUpperCase)
                              .toList();
        
        n.forEach(System.out::println);

    }
}