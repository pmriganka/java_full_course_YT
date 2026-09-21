

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamAPI {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,2,3,8,1,6);
        
        // double the values of the even number and get the sum

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        
        // s3.forEach(n -> System.out.println(n));

        int result = s3.reduce(0, (c, d) -> c + d);

        System.out.println(result);

        // Alternative

        int result2 = nums.stream()
                         .filter(n -> n % 2 == 0)
                         .map(n -> n * 2)
                         .reduce(0, (c, d) -> c + d);
        
        System.out.println(result2);


    }
}