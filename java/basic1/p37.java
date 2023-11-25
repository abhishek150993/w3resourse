/*
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */
import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String new_string = "";
        int len = string.length();

        for(int i = len-1; i >= 0; i--) {
            new_string += string.charAt(i);
        }

        System.out.println(new_string);
        in.close();
    }
}
