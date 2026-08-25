

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

class StreamAPI2 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,2,3,8,1,6);
        
        Predicate<Integer> p = n -> n % 2 == 0;
        
        int result = nums.stream()
                        .filter(p)
                        .map(n -> n * 2)
                        .reduce(0, (c, d) -> c + d);
        
        System.out.println(result);

        Stream<Integer> sortedvalues = nums.stream().sorted()
                        .filter(n -> n%2==0)
                        .sorted();

        sortedvalues.forEach(n -> System.out.println(n));

    }
}