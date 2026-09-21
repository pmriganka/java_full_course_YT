

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

class MapDemo {
    
    public static void main(String[] args) {
        
        // Map<String, Integer> students = new HashMap<>(); // if we want to use multi thread use the word synchronized with hashmap
        Map<String, Integer> students = new Hashtable<>(); // hashtabels are used if you are working on multiple threads
        
        students.put("Mrignaka", 56);
        students.put("Rumela", 54);
        students.put("Madhuparna", 87);
        System.out.println(students);

        System.out.println("--------------Showing Keys are unique cannot be duplicated --------------------------------");
        System.out.println("      ");
        
        students.put("Rumela", 92);
        System.out.println(students);


        System.out.println("--------------Showing Key Sets --------------------------------");
        System.out.println("      ");

        for(String key : students.keySet()) {

            System.out.println(key);

        }

        System.out.println("--------------Showing value Sets --------------------------------");
        System.out.println("      ");

        for(String key : students.keySet()) {

            System.out.println(students.get(key));

        }


    }
}