
class A {

    public void show() {
        System.out.println("In A show");
    }

    class B {
        public void config() {
            System.out.println("In B config");
        }
    }

}

public class InnerClassDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        A.B obj2 = obj.new B(); 
        obj2.config();
        
        // Note :  An Inner CLass can be accessed by the above example
        // However, B can also be accessed directly with class and not object if we use the static keyword for class B
        //    static class B {
        //     public void config() {
        //         System.out.println("In B config");
        //     }
        // }
        
        //     A.B obj3 = new A.B();
        //     obj3.config();

    }
}
