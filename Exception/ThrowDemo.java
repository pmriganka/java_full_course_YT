
// class MrigankaException extends RuntimeException
class MrigankaException extends Exception {

    public MrigankaException(String message) {

        super(message);
        
    }
}


class ThrowDemo {
    
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        int arr[] = new int[5];

        try
        {
            j = 18/i;
            if (j == 0) {
                throw new MrigankaException("Cannot divide by zero"); // This message is sent to the MrigankaException constructor
            }
        }
        catch (MrigankaException e) {

            System.out.println("MrigankaException caught: " + e.getMessage());

        }
        catch(Exception e){

            System.out.println("Soemthing went wrong. " + e);
        }
        
        System.out.println("Bye");
    }
}
