class Parent {

     int x = 10;

}

class Practice1 extends Parent {

    int x=20;

    void show() {

        System.out.print(this.x);
        System.out.print(super.x);
        
    }
    
    public static void main(String[] args) {

        Practice1 p = new Practice1();
        p.show();

    }
}
