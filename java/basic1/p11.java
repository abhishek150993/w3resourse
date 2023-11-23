/*
 Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.lang.Math;
public class p11 {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
