/**
Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
 */
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = num1 + num2;
        System.out.println(result);
        in.close();
    }
}
