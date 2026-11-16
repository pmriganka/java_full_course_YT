public class BinarySearchRecursive {


    public static int binarysearchrecursive(int[] arr, int target, int left, int right, int steps) {

        if (left > right) {
            System.out.println("Steps taken: " + " " + steps);
            return -1;
        }

        int mid = left + (right - left) / 2;
        steps++;

        if (arr[mid] == target) {

            System.out.println("Steps taken: " + " " + steps);
            return mid;

        } else if (arr[mid] < target) {

            return binarysearchrecursive(arr, target, mid + 1, right, steps);

        } else {

            return binarysearchrecursive(arr, target, left, mid - 1, steps);

        }
    }
    
    public static void main(String[] args) {


        int[] arr = {1, 3, 3, 4, 5, 11, 13 ,17, 19, 23, 55, 67};
        int target = 552;

        int left = 0;
        int right = arr.length - 1;

        int result = binarysearchrecursive(arr, target, left, right, 0);

        if (result == -1) {
            System.out.println("Element not found");
            
        } else {
            System.out.println("Element found at index " + result);
           
        }
        
    }
    
}
