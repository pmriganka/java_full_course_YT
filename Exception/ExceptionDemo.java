class ExceptionDemo {
    
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        int arr[] = new int[5];

        try
        {
            j = 18/i;
            System.out.println(j);
            System.out.println(arr[5]); 
        }
        catch(Exception e)
        {
            System.out.println("Soemthing went wrong. " + e);
        }
        
        System.out.println("Bye");
    }
}
