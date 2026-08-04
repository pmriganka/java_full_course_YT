
// FInal keyword can be used for variable , methid and class

final class Calc { 

    public void show() {
    
        System.out.println("In Calc show()");
    
    }

    public final void add(int a, int b) {  // cannot be used by extened class
     
        System.out.println("In Calc add()");
    
    }

}

class Advcalc extends Calc { 

    // cannot inherit from final Calc
    
}

class final_keyworde {

    public static void main(String[] args) {

        final int a = 10;
        // a = 15;       //error: cannot assign a value to final variable a     
        System.out.println(a);
        // a = 20; // This will throw an error because a is final


    }    
}
