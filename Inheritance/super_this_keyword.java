
class A extends Object{

    public A() {

        super();
        System.out.println("in A default constructor");
    }

    public A(int i) {

        super();
        System.out.println("in A param constructor");
    }
}

class B extends A {

    public B() {
        
        super();
        System.out.println("in B default constructor");
    }

    public B(int i) {
        
        this(); // executes constuructor of current
        System.out.println("in B param constructor");
    }
}



class super_this_keyword {

    public static void main(String[] args) {
        
        B obj = new B();

        // In order to call parameterized constructor
        System.out.println("------- Calling parameterized Constructor ----------");

        // Here we can observe it is calling parameterized constructor for class B but default for class A as super() method is called first
        System.out.println("------- Super() method default to all class ----------");
        B obj2 = new B(5);

        

        

    }

}

