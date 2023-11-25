/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
 */
import java.util.Scanner;
import java.lang.Math;

public class p17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bin1 = in.nextInt();
        int bin2 = in.nextInt();
        
        int result = addBinaryNumbers(bin1, bin2);
        System.out.println(result);
        in.close();
    }

    static int addBinaryNumbers(int bin1, int bin2) {
        int num1 = binaryToInt(bin1);
        int num2 = binaryToInt(bin2);
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);

        int result = intToBinary(num1 + num2);
        System.out.println("bin: "+ result);
        return result;
    }

    static int binaryToInt(int bin) {
        int num = 0;
        int digit = 0;
        int multiplier = 0;

        while(bin > 0) {
            digit = bin % 10;
            bin = bin / 10;
            num += (digit * Math.pow(2, multiplier));
            multiplier++;
        }
        return num;
    }

    static int intToBinary(int num) {
        int bin = 0;
        int digit = 0;
        int multiplier = 0;

        while(num > 0) {
            digit = num % 2;
            num = num / 2;
            bin += (digit * Math.pow(10, multiplier));
            multiplier++;
        }
        return bin;
    }
}
