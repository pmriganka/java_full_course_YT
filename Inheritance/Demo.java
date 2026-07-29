public class Demo {

    public static void main(String[] args) {

        // java does not support multiple inheritence like class C extends B, A
        // but it supports single inheritence like class C extends B
        // It has multi level inheritence
        
        Advcalc obj = new Advcalc();
      
        System.out.println("Addition: " + obj.add(1, 2));
        System.out.println("Subtraction: " + obj.sub(7, 4));
        System.out.println("Multiplication: " + obj.mul(5, 6));
        System.out.println("Division: " + obj.div(17, 8));

    }

}
