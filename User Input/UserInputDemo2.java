import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class UserInputDemo2 {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

    }

}