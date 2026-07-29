
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

    public static void display1(Mobile mobile){
        // Cannot access non-static variables from static method
        System.out.println("Static method called");
        // we need to call the object to print values from a static method
        // name does nto need the object
        System.out.println(mobile.brand + " : " + mobile.price + " : " + name);

    }
}


public class static_method
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

        System.out.println("--------After changing method name to static and assigning an object to it-------------------");

        mobile1.name = "Mriganka";
        // to call other objects from static method we need to pass the object as argument
        Mobile.display1(mobile1); 
        
    }
}
