
interface A {

    int age=25;
    String area="Kolkata";

    // In Interface all the variables are static and final by default
    // In Interface all the methods are public and abstract by default

    void method1();
    void method2();

}

class B implements A {

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

}

interface B extends A {

    void method3();
    
}

public class InterfaceDemo {
    
    public static void main(String[] args) {

        A obj = new B();
        obj.method1();
        obj.method2();

        System.out.println(A.age);
       
        
    }
}