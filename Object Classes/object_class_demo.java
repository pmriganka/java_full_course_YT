
class Laptop {

    String brand;
    int price;
    
}

public class object_class_demo {

    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Dell";
        laptop1.price = 50000;
        
        
        System.out.println(laptop1);
        // If we prnt the object it gives an output "Laptop@28a418fc"
        // In the backgroud it actually calls the toString() method by default
        // 28a418fc is a hash code for the object

        Laptop laptop2 = new Laptop();
        laptop2.brand = "Dell";
        laptop2.price = 50000;
        
        System.out.println(laptop1.equals(laptop2));
        // oIt will be failse as it has different hash values generated
        // We can check variable by variable using a differ method in Laptop Class like

        // public boolean equals(Laptop lappy){
        //     return this.brand.equals(lappy.brand) && this.price == lappy.price;

        // The above will give True as it overriddes he object class method equals with Laptop class method Equals

        }

    }

}
