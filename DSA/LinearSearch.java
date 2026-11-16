public class LinearSearch {


    public static int linearsearch(int[] arr, int target) {
        
        int steps = 0;
        for(int i = 0; i < arr.length; i++) {
            
            steps++;
            if (arr[i] == target) {
                System.out.println("Steps taken: " + " " + steps);
                return i;
            }
               
        }

        return -1;
    }
    
    public static void main(String[] args) {


        int[] arr = {1, 3, 3, 4, 5, 11, 13 ,17, 19, 23, 55, 67};
        int target = 55;
        int result = linearsearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        
    }
    
}
