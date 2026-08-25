import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

class ParallelStream {
    
    public static void main(String[] args) {

        int size = 10_000_000;
        List<Integer> nums = new ArrayList<>(size);

        Random rand = new Random();

        for(int i=1; i<=size; i++) {
            nums.add(rand.nextInt(1000));
        }

        // int sum1 = nums.stream()
        //                .map(i -> i*2)
        //                .reduce(0, (c,b) -> c + b);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                       .map(i -> {
                        try {
                            Thread.sleep(1);
                        }catch(Exception e){

                        }
                        return i * 2;
                       })
                       .mapToInt(i -> i)
                       .sum();
        long endSeq = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                       .map(i -> {
                        try {
                            Thread.sleep(1);
                        }catch(Exception e){

                        }
                        return i * 2;
                       })
                       .mapToInt(i -> i)
                       .sum();
        long endpara = System.currentTimeMillis();

        System.out.println("Normal Stream: " + (endSeq - startSeq) + "ms");
        System.out.println("Parallel Stream: " + (endpara - startpara) + "ms");


    }
    
}
