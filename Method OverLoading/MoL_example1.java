class Addition {

    public int add(int a, int b) {

        System.out.println("Calling second Method 2 variable");
        return a + b;
    }

    public int add(int a, int b, int c) {

            System.out.println("Calling second Method 3 variable");
            return a + b + c;

    }

}

class MoL_example1 {

    

    public static void main(String[] args) {
        
        Addition ad = new Addition();

        // Method overloading is when decision is mafe which method to use during Compilation

        System.out.println(ad.add(2 , 5 ));
        System.out.println(ad.add(2 , 5 , 1));

    }

}
