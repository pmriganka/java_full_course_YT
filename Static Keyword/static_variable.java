
class Mobile
{
    String brand;
    int price;
    static String name; 
    // "static" keyword makes the varibale common for all the objects
    //  static belongs to the class not object

   
    public void display(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class static_variable
{
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1000;
        
        Mobile.name = "iPhone"; // Accessing static variable using class name
        
        mobile1.display();

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
    mobile2.price = 2000;
        mobile2.name = "Galaxy";
        mobile2.display();

        System.out.println("--------After changing variable name to static and assigning a value to it -------------------");

        mobile1.name = "Mriganka";

        mobile1.display();
        mobile2.display();
        
    }
}
