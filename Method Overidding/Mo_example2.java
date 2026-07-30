
class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

}

class Advcalc extends Calculator {

    public int add(int a, int b) {

        return a + b + 1;

    }

}

class Mo_example2 {

    public static void main(String[] args) {
        
        Advcalc obj = new Advcalc();
        System.out.println(obj.add(2, 3)); //instead of calling parent class method, it calls child class method (overridden) so ansewer is 6 instead of 5

    }

}
