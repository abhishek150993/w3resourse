/*
Write a Java program to swap two variables.
 */
public class p15 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Without any variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }
}
