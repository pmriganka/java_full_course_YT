import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class TryFinallyDemo {
    
    public static void main(String[] args) throws IOException {

        int num = 0;
        BufferedReader br = null;
        try
        {
            System.out.println("Enter a number : ");     
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println("Number is: " + num);

        }
        finally
        {
            br.close();
        }
    }
}
