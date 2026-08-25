
// Pass by value and Integer Mutability
public class TrickSeries1 {

    static void change(Integer x){

        x++;

    }

    public static void main(String[] args) {

        Integer x = 10;
        change(x);
        System.out.println(x);

    }
}
