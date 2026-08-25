
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class CollectionAPIDemo {


    public static void main(String[] args) {

        // Collection<Integer> num = new ArrayList<Integer>();

        // Collection interface doesn't have indexOf() and get() methods - those are specific to List interface

        System.out.println("List Demo");
        List<Integer> num = new ArrayList<Integer>();

        // Always mention the type , otherwise it will be treated as object
        // If nto used it will give error in comple Time
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println(num.indexOf(20));

        System.out.println(num.size());

        System.out.println(num.get(1));

        System.out.println("-------------------------------------------");
        System.out.println("Set Demo");

        Set<Integer> numSet = new HashSet<Integer>();
        
        numSet.add(15);
        numSet.add(40);
        numSet.add(30);
        numSet.add(15);

        for(int n : numSet) {

            System.out.println(n);
            
        }

        System.out.println("-------------------------------------------");
        System.out.println("Tree Set Demo");

        Set<Integer> num2 = new TreeSet<Integer>();
        
        num2.add(15);
        num2.add(40);
        num2.add(30);
        num2.add(15);

        for(int n : num2) {

            System.out.println(n);
            
        }

        System.out.println("-------------------------------------------");
        System.out.println("Iterator");

        Iterator<Integer> values = num2.iterator();
        
        while(values.hasNext()) {
            System.out.println(values.next());
        }

        
    }
}