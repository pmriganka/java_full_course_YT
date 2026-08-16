
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
    // public void add(int a , int b) {

    //     System.out.println("In Advcalc add()");

    // }
    //     PS C:\Users\paulm5\OneDrive - Dell Technologies\Desktop\Personal_Work_and_Dev\Java_YT\Final_Keyword> javac .\final_keyword.java
    // .\final_keyword.java:20: error: cannot inherit from final Calc
    // class Advcalc extends Calc { 
    //                       ^
    // .\final_keyword.java:23: error: add(int,int) in Advcalc cannot override add(int,int) in Calc
    //     public void add(int a , int b) {
    //                 ^
    //   overridden method is final
    // 2 errors
    
}

class final_keyword {

    public static void main(String[] args) {

        final int a = 10;
        // a = 15;       //error: cannot assign a value to final variable a     
        System.out.println(a);
        // a = 20; // This will throw an error because a is final
        Calc c = new Calc();
        c.add(2,3); // We can call a final method id the class is not final or else it will give a compialtion error

    }    
}
