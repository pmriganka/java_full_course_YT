import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserInputDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter a number : ");

        // int num = System.in.read();
        // System.out.println(num);  // It gives the ASCII value , if you enter 5 it gives 53
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());

        System.out.println(num);

    }

}