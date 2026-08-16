

class MrigankaException  {

    public void show() throws ClassNotFoundException{

        Class.forName("Calculator");

    }
}


class ThrowsDemo {
    
    public static void main(String[] args) {

        MrigankaException me = new MrigankaException();
        
        try {
            
            me.show();
        
        } 
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
        
        }
    }
}
