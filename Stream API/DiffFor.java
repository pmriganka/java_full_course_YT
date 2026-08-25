import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class DiffFor {
    
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,2,3,8,1,6);

        nums.forEach(n -> System.out.println(n)); //lambda Expression for For Each

        
    }
    
}