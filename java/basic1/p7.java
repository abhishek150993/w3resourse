/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
import java.util.Scanner;

public class p7 {
    static int tableFrom = 1;
    static int tableTo = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = tableFrom; i <= tableTo; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        } 
        in.close();
    }
}
