/**
Write a Java program to print 'Hello' on screen and your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
 */

import java.util.Scanner;

public class p1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.print("Hello\n" + name + "!");
        in.close();
    }
}