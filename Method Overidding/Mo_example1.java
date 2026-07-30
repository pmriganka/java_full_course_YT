class A {

    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }

}

class B extends A {

    public void show() {
        System.out.println("in B show");
    }

}

class Mo_example1 {

    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();  // calls B's show() , class A show() method (overridden)
        obj.config(); // calls A's config() method (inherited)

        // Method overridding is decided during Runtime

    }

}