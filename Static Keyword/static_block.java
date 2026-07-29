
class Mobile
{
    String brand;
    int price;
    static String name; 
   
    public Mobile(){
        brand = "";
        price = 0;
        System.out.println("Constructor called");
    }

    static {

        // This block will be executed only once when the class is loaded
        // It is used to initialize static variables
        // First class is called and then objects are loaded

        name = "Android";
        System.out.println("Static block called");
    }

}


public class static_block
{
    public static void main(String[] args) throws Exception {

        // Mobile mobile1 = new Mobile();
        // Mobile mobile2 = new Mobile();

        // If objects are not created the static block is not executed
        // To check the static block execution only we can just laod the class

        Class.forName("Mobile");
        
    }
}
