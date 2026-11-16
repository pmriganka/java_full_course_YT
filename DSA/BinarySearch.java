public class BinarySearch {


    public static int binarysearch(int[] arr, int target) {
        
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;
        
        while(left <= right) {
            
            int mid = left + (right - left) / 2;
            steps++;

            if (arr[mid] == target) {

                System.out.println("Steps taken: " + " " + steps);
                return mid;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }
            
            
        }

        return -1;
    }
    
    public static void main(String[] args) {


        int[] arr = {1, 3, 3, 4, 5, 11, 13 ,17, 19, 23, 55, 67};
        int target = 55;
        int result = binarysearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
            
        } else {
            System.out.println("Element found at index " + result);
           
        }
        
    }
    
}
