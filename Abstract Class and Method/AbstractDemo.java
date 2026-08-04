abstract class Car {

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public abstract void drive();
    public abstract void refuel();
    // Note : Abstract Method will only be inside Abstruct class
    // Note :  No compulsion that abstruct class will have Abstruct Method

}

class WagonR extends Car {

    //  Note : SUBCLASS of an ABSTRACT class should define all the method in the ABSTRACT class. Compulsory or it will throw error

    public void start() {
        System.out.println("WagonR started");
    }

    public void stop() {
        System.out.println("WagonR stopped");
    }

    public void drive() {
        System.out.println("WagonR is in drive");
    }

    public void refuel() {
        System.out.println("WagonR is refueling");
    }

}

public class AbstractDemo{

    public static void main(String[] args) {


        // Note : Car car = new Car(); // This will throw error as we cannot create an object of an abstract class

        WagonR wagonR = new WagonR();
        wagonR.start();
        wagonR.stop();
        wagonR.drive();
        wagonR.refuel();
    }
    
}

// We can make implementations using AnonymousInner Class to call the Abstruct class 
// For example 

// public class AbstractDemo{

//     public static void main(String[] args) {

//         Car obj = new Car() {
//             public void drive() {
//                 System.out.println("Driving");
//             }
//             public void refuel() {
//                 System.out.println("Refueling");
//             }
//         };
//         obj.drive();
//         obj.refuel();

//     }
    
// }
