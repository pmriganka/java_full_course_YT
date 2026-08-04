
class A {

    public void showmethismethod() {

        System.out.println("Method belonga to class A");
    }

}

class B extends A {

    // Annotations help suer to ask java to check for things during compilation like overide here
    // throws an error if the method in class B does not match
    @Override 
    public void showmethimethod() {

        System.out.println("Method belonga to class B");
    }

}

public class AnnotationDemo {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.showmethismethod();
    
    }
}
