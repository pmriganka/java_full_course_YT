import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class TryFinallyDemo {
    
    public static void main(String[] args) throws IOException {

        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            // Once the try gets ove rthe resource get close automatically
            System.out.println("Enter a number : ");     
            num = Integer.parseInt(br.readLine());
            System.out.println("Number is: " + num);

        }
    }
}
